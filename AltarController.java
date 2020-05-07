class AltarController{
	private Altar altar;
	
	public void touchDown(x,y){
		if(//conditions to go right) 
			altar.changeCurrentGod(1);
		if(//conditions to go left)
			altar.changeCurrentGod(-1);
		if(//conditions to go up) 
			altar.changeCurrentLevel(1);
		if(//conditions to go down)
			altar.changeCurrentLevel(-1);
		if(//condotions of touching god)
			altar.isGodTouched = !altar.isGodTouched;
			if(altar.isCurrentGodSummoned()) blessings.add(altar.getRealGod().blessing);
	}
}