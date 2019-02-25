package ex3;
public enum BirdTypeEnum  {
    Eagle, Sparrow, Pigeon;

    public String move() {
    	return getType() + " fly";
    }

    public String getVoice() {
    	return getType() + " gives voice";
    }
    
    public String getType(){
    	 switch (this) {
         case Eagle:
             return Eagle.toString();
         case Pigeon:
             return Pigeon.toString();
         case Sparrow:
             return Sparrow.toString();
         default:
             return this.toString();
         }
    }
}