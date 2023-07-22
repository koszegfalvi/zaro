package person;

public enum Gender {
    MAN("FÉRFI","MAN"),
    WOMAN("NŐ","WOMAN");
    private String hungarianName;
    private String englishName;
    Gender(String hungarianName,String englishName){
        this.hungarianName=hungarianName;
        this.englishName=englishName;


    }
    public String getMagyarNev(){
        return  hungarianName;

    }
    public String getEnglishName(){

        return englishName;
    }




}
