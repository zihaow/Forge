package ml.boxes.inventory;

import invtweaks.api.container.ChestContainer;

import java.util.List;

import ml.boxes.api.box.IBoxContainer;
import ml.boxes.data.ItemBoxContainer;
import ml.core.item.StackUtils;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

@ChestContainer
public class ContainerBox extends Container {

	public final IBoxContainer box;
	public final EntityPlayer player;

	//Create Continer and add all slot to the continer 
	public ContainerBox(IBoxContainer box, EntityPlayer pl) {
		this.box = box;
		this.player = pl;
		box.boxOpen();

		int leftCol = 9;
		int ySize = 168;

		List<Slot> boxSlots = box.getBox().getSlots();
		for (Slot slt : boxSlots){
			addSlotToContainer(slt);
		}

		for (int slt=9; slt < pl.inventory.mainInventory.length; slt++){
			int row = (int)Math.floor(slt/9) -1;
			addSlotToContainer(new Slot(pl.inventory, slt, 9 + (slt%9)*18, ySize - 83 + row*18));
		}

		for (int hotbarSlot = 0; hotbarSlot < 9; hotbarSlot++) {
			addSlotToContainer(new Slot(pl.inventory, hotbarSlot, leftCol + hotbarSlot * 18, ySize - 25));
		}
	}

	//Check the player entity to see if it can interact  
	@Override
	public boolean canInteractWith(EntityPlayer var1) {
		return box.boxUseableByPlayer(var1) && (!(box instanceof ItemBoxContainer) || ((ItemBoxContainer)box).stack == var1.getCurrentEquippedItem());
	}

	//action need to be done while a particular slot clicked 
	@Override
	public ItemStack slotClick(int slotNum, int mouseBtn, int action,
			EntityPlayer par4EntityPlayer) {
		
		if (!box.slotPreClick(this, slotNum, mouseBtn, action, par4EntityPlayer))
			return null;
		
		ItemStack ret = super.slotClick(slotNum, mouseBtn, action, par4EntityPlayer);
		save(par4EntityPlayer);
		return ret;
	}

	//move the stack from particular slot
	@Override
	public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer, int par2) {
		ItemStack var3 = null;
		Slot var4 = (Slot)this.inventorySlots.get(par2);
		int bxSize = box.getBox().getSizeInventory();

		if (var4 != null && var4.getHasStack()) {
			ItemStack var5 = var4.getStack();
			var3 = var5.copy();
			if (par2 < bxSize) {
				if (!mergeItemStack(var5, bxSize,inventorySlots.size(), true))
					return null;
			} else if (!StackUtils.mergeItemStack(var5, 0, bxSize, false, this)) {
				return null;
			}

			if (var5.stackSize == 0) {
				var4.putStack((ItemStack)null);
			} else {
				var4.onSlotChanged();
			}
		}

		return var3;
	}

	//action need to be taken when continer closed 
	@Override
	public void onContainerClosed(EntityPlayer par1EntityPlayer) {
		super.onContainerClosed(par1EntityPlayer);
		save(par1EntityPlayer);
		box.boxClose();
	}
	
	//save the entity of palyer 
	private void save(EntityPlayer pl){
		if (!pl.worldObj.isRemote){
			box.saveData();
		}
	}
}
