public class Settings {
    private  String theme;
    private  String wallpaper;
    private  String display;
    private  String notification;

    public Settings(){
        theme = "light";
        wallpaper = "default";
        display = "normal";
        notification = "default";
    }
    public  String getTheme(){
        return theme;
    }
    public void setTheme(String newTheme){
        theme = newTheme;
    }

    public String getWallpaper(){
        return wallpaper;
    }
    public void setWallpaper(String newWallpaper){
        wallpaper = newWallpaper;
    }

    public String getDisplay(){
        return display;
    }
    public void setDisplay(String newDisplay){
        display = newDisplay;
    }

    public String getNotification(){
        return notification;
    }
    public void setNotification(String newNotification){
        notification= newNotification;
    }
}
