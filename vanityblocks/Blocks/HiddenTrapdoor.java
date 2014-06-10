package vanityblocks.Blocks;

import java.util.ArrayList;
import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.block.Block;
import net.minecraft.block.BlockHalfSlab;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Icon;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;

/*
 * Author: AbrarSyed
 * Straight rip of his Open source code + modified
 */
public class HiddenTrapdoor extends Block {
	public HiddenTrapdoor(int par1) {
		super(par1, Material.wood);

		disableStats();
		setHardness(3.0F);
		setCreativeTab(vanityblocks.VanityBlocks.tabCustom);
		setStepSound(soundWoodFootstep);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister) {
		blockIcon = par1IconRegister
				.registerIcon("vanityblocks:hiddentrapdoor");
	}

	/**
	 * Is this block (a) opaque and (b) a full 1m cube? This determines whether
	 * or not to render the shared face of two adjacent blocks and also whether
	 * the player can attach torches, redstone wire, etc to this block.
	 */
	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public void addCreativeItems(ArrayList itemList) {
		itemList.add(new ItemStack(this));
	}

	/**
	 * If this block doesn't render as an ordinary block it will return False
	 * (examples: signs, buttons, stairs, etc)
	 */
	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}

	@Override
	public boolean getBlocksMovement(IBlockAccess par1IBlockAccess, int par2,
			int par3, int par4) {
		return !isTrapdoorOpen(par1IBlockAccess.getBlockMetadata(par2, par3,
				par4));
	}

	/**
	 * The type of render function that is called for this block
	 */
	@Override
	public int getRenderType() {
		return 0;
	}

	@Override
	public Icon getBlockTexture(IBlockAccess world, int x, int y, int z, int dir) {
		// modify coordinates to get hinge Block.
		int i = world.getBlockMetadata(x, y, z);
		int j = x;
		int k = z;

		if ((i & 3) == 0) {
			k++;
		}

		if ((i & 3) == 1) {
			k--;
		}

		if ((i & 3) == 2) {
			j++;
		}

		if ((i & 3) == 3) {
			j--;
		}

		// actually get the texture.
		Block block = Block.blocksList[world.getBlockId(j, y, k)];

		if (block == null)
			return blockIcon;

		Icon texture = block.getBlockTexture(world, j, y, k, dir);
		return texture;
	}

	@Override
	public int colorMultiplier(IBlockAccess par1IBlockAccess, int par2,
			int par3, int par4) {

		if (getBlockTexture(par1IBlockAccess, par2, par3, par4, 1).equals(
				Block.grass.getBlockTextureFromSide(1))) {
			int i = 0;
			int j = 0;
			int k = 0;

			for (int l = -1; l <= 1; l++) {
				for (int i1 = -1; i1 <= 1; i1++) {
					int j1 = par1IBlockAccess.getBiomeGenForCoords(par2 + i1,
							par4 + l).getBiomeGrassColor();
					i += (j1 & 0xff0000) >> 16;
					j += (j1 & 0xff00) >> 8;
					k += j1 & 0xff;
				}
			}

			return (i / 9 & 0xff) << 16 | (j / 9 & 0xff) << 8 | k / 9 & 0xff;
		}

		return 0xffffff;
	}

	/**
	 * Returns the bounding box of the wired rectangular prism to render.
	 */
	@Override
	public AxisAlignedBB getSelectedBoundingBoxFromPool(World par1World,
			int par2, int par3, int par4) {
		setBlockBoundsBasedOnState(par1World, par2, par3, par4);
		return super
				.getSelectedBoundingBoxFromPool(par1World, par2, par3, par4);
	}

	/**
	 * Returns a bounding box from the pool of bounding boxes (this means this
	 * box can change after the pool has been cleared to be reused)
	 */
	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World,
			int par2, int par3, int par4) {
		setBlockBoundsBasedOnState(par1World, par2, par3, par4);
		return super.getCollisionBoundingBoxFromPool(par1World, par2, par3,
				par4);
	}

	/**
	 * Updates the blocks bounds based on its current state. Args: world, x, y,
	 * z
	 */
	@Override
	public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess,
			int par2, int par3, int par4) {
		setBlockBoundsForBlockRender(par1IBlockAccess.getBlockMetadata(par2,
				par3, par4));
	}

	/**
	 * Sets the block's bounds for rendering it as an item
	 */
	@Override
	public void setBlockBoundsForItemRender() {
		float f = 0.1875F;
		setBlockBounds(0.0F, 0.5F - f / 2.0F, 0.0F, 1.0F, 0.5F + f / 2.0F, 1.0F);
	}

	public void setBlockBoundsForBlockRender(int par1) {
		float var2 = 0.1875F;

		if ((par1 & 8) != 0) {
			setBlockBounds(0.0F, 1.0F - var2, 0.0F, 1.0F, 1.0F, 1.0F);
		} else {
			setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, var2, 1.0F);
		}

		if (isTrapdoorOpen(par1)) {
			if ((par1 & 3) == 0) {
				setBlockBounds(0.0F, 0.0F, 1.0F - var2, 1.0F, 1.0F, 1.0F);
			}

			if ((par1 & 3) == 1) {
				setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, var2);
			}

			if ((par1 & 3) == 2) {
				setBlockBounds(1.0F - var2, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
			}

			if ((par1 & 3) == 3) {
				setBlockBounds(0.0F, 0.0F, 0.0F, var2, 1.0F, 1.0F);
			}
		}
	}

	/**
	 * Called upon block activation (left or right click on the block.). The
	 * three integers represent x,y,z of the block.
	 */
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z,
			EntityPlayer entityplayer, int something1, float something2,
			float something3, float something4) {
		int i = world.getBlockMetadata(x, y, z);
		world.setBlockMetadataWithNotify(x, y, z, i ^ 4, 2);
		world.playAuxSFXAtEntity(entityplayer, 1003, x, y, z, 0);
		return true;
	}

	public void onPoweredBlockChange(World par1World, int par2, int par3,
			int par4, boolean par5) {
		int i = par1World.getBlockMetadata(par2, par3, par4);
		boolean flag = (i & 4) > 0;

		if (flag == par5)
			return;
		else {
			par1World.setBlockMetadataWithNotify(par2, par3, par4, i ^ 4, 2);
			par1World.playAuxSFXAtEntity(null, 1003, par2, par3, par4, 0);
			return;
		}
	}

	/**
	 * Lets the block know when one of its neighbor changes. Doesn't know which
	 * neighbor changed (coordinates passed are their own) Args: x, y, z,
	 * neighbor blockID
	 */
	@Override
	public void onNeighborBlockChange(World par1World, int par2, int par3,
			int par4, int par5) {
		if (!par1World.isRemote) {
			int i1 = par1World.getBlockMetadata(par2, par3, par4);
			int j1 = par2;
			int k1 = par4;

			if ((i1 & 3) == 0) {
				k1 = par4 + 1;
			}

			if ((i1 & 3) == 1) {
				--k1;
			}

			if ((i1 & 3) == 2) {
				j1 = par2 + 1;
			}

			if ((i1 & 3) == 3) {
				--j1;
			}

			if (!(isValidSupportBlock(par1World.getBlockId(j1, par3, k1)) || par1World
					.isBlockSolidOnSide(j1, par3, k1,
							ForgeDirection.getOrientation((i1 & 3) + 2)))) {
				par1World.setBlockToAir(par2, par3, par4);
				dropBlockAsItem(par1World, par2, par3, par4, i1, 0);
			}

			boolean flag = par1World.isBlockIndirectlyGettingPowered(par2,
					par3, par4);

			if (flag || par5 > 0 && Block.blocksList[par5].canProvidePower()) {
				onPoweredBlockChange(par1World, par2, par3, par4, flag);
			}
		}
	}

	/**
	 * Ray traces through the blocks collision from start vector to end vector
	 * returning a ray trace hit. Args: world, x, y, z, startVec, endVec
	 */
	@Override
	public MovingObjectPosition collisionRayTrace(World par1World, int par2,
			int par3, int par4, Vec3 par5Vec3D, Vec3 par6Vec3D) {
		setBlockBoundsBasedOnState(par1World, par2, par3, par4);
		return super.collisionRayTrace(par1World, par2, par3, par4, par5Vec3D,
				par6Vec3D);
	}

	/**
	 * Called when a block is placed using an item. Used often for taking the
	 * facing and figuring out how to position the item. Args: x, y, z, facing
	 */
	@Override
	public int onBlockPlaced(World world, int x, int y, int z, int side,
			float clickX, float clickY, float clickZ, int currentMeta) {
		int newMeta = 0;

		if (side == 2) {
			newMeta = 0;
		}

		if (side == 3) {
			newMeta = 1;
		}

		if (side == 4) {
			newMeta = 2;
		}

		if (side == 5) {
			newMeta = 3;
		}

		if (side != 1 && side != 0 && clickY > 0.5F) {
			newMeta |= 8;
		}

		return newMeta;
	}

	/**
	 * checks to see if you can place this block can be placed on that side of a
	 * block: BlockLever overrides
	 */
	@Override
	public boolean canPlaceBlockOnSide(World par1World, int par2, int par3,
			int par4, int par5) {
		if (par5 == 0)
			return false;
		else if (par5 == 1)
			return false;
		else {
			if (par5 == 2) {
				++par4;
			}

			if (par5 == 3) {
				--par4;
			}

			if (par5 == 4) {
				++par2;
			}

			if (par5 == 5) {
				--par2;
			}

			return isValidSupportBlock(par1World.getBlockId(par2, par3, par4))
					|| par1World.isBlockSolidOnSide(par2, par3, par4,
							ForgeDirection.UP);
		}
	}

	public static boolean isTrapdoorOpen(int par0) {
		return (par0 & 4) != 0;
	}

	/**
	 * Checks if the block ID is a valid support block for the trap door to
	 * connect with. If it is not the trapdoor is dropped into the world.
	 */
	private static boolean isValidSupportBlock(int id) {
		if (id <= 0)
			return false;
		else {
			Block block = Block.blocksList[id];
			return block != null && block.blockMaterial.isOpaque()
					&& block.renderAsNormalBlock() || block == Block.glowStone
					|| block instanceof BlockHalfSlab
					|| block instanceof BlockStairs;
		}
	}

	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer player, List list,
			boolean par4) {
		list.add("Place on the side of the block you want it to change to");
	}
}