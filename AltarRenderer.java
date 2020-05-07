class AltarRenderer{
	//float CAMERA_WIDTH, float CAMERA_HEIGHT, OrthographicCamera camera, Texture[] background, Texture[] arrows, Altar altar


	public void render(){
		drawBackground(altar.getCurrentLevel);
		drawGod(altar.getCurrentGod, altar.isCurrentGodSummoned(), altar.isGodTouched()); // if god is not summoned but touched, show instruction how to summon it
		drawArrows(altar.getCurrentGod, altar.getCurrentLevel); //if currGod != edge, draw both arrows<->, and so for level up and down arows
		drawExit();
		
	}
}