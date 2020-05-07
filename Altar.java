class Altar{
	private int currentGod;
	private int currentLevel;
	private boolean isCurrentGodSummoned;
	private GodInteractor godInteractor;
	private GameScreen gameScreen;
	public boolean isGodTouched;
	
	public Altar(GameScreen gameScreen){
		this.gameScreen = gameScreen;
		this.godInteractor = new GodInteractor();
		currentGod = 1;
		currentLevel = 1;
		this.isGodTouched = false;
		
	}
	
	public void changeCurrentGod(int delta){
		currentGod+=delta;
	}
	public void changeCurrentLevel(int delta){
		currentLevel += delta;
	}
	public int getCurrentGod(){return currentGod;}
	
	public int getCurrentLevel(){return currentLevel;}
	
	public boolean isCurrentGodSummoned(){return isCurrentGodSummoned;}

	
	private void update(){
		isCurrentGodSummoned=godInteractor.summonedGods.contains(GodsRepository.get(currentLevel, currentGod));
	}
	
public God getRealGod(){
	return GodsRepository.get(currentLevel, currentGod);
}
}