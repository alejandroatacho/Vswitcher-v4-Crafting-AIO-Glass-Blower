//Title: V4 AIO Glassblowing Pipe Hinamizawa
//____________________________________________________________________________________________
//Users Decision variables Down Below:
int user_decision = 0;
//0 Beer glass
//1 Candle lantern
//2 Oil lamp
//3 Vial
//4 Fishbowl
//5 Unpowered Staff Orb
//6 Lantern Lens
//7 Light Orb
//____________________________________________________________________________________________
//Hinamizawa's codes down below:
int gPipe = 1785;
int gPipeSlot = v.getInventory().slot(gPipe);
int moltenG = 1775;
int moltenGCount = v.getInventory().count(moltenG);
int moltenGSlot = v.getInventory().slot(moltenG);
int moltenOutput;
Widget multiSkillMenu = client.getWidget(270,13);


   private void setGlassMaker() {
    if (user_decision == 0) {
    v.invoke("Make","<col=ff9040>Beer glass</col>",1,57,-1,17694734,false);
		}
    else if (user_decision == 1) {
    v.invoke("Make","<col=ff9040>Candle lantern</col>",1,57,-1,17694735,false); 
    }
    else if (user_decision == 2) {
    v.invoke("Make","<col=ff9040>Oil lamp</col>",1,57,-1,17694736,false); 
    }
    else if (user_decision == 3) {
      v.invoke("Make","<col=ff9040>Vial</col>",1,57,-1,17694737,false);
    }
    else if (user_decision == 4) {
    v.invoke("Make","<col=ff9040>Fishbowl</col>",1,57,-1,17694738,false);
    }
    else if (user_decision == 5) {
    v.invoke("Make","<col=ff9040>Unpowered staff orb</col>",1,57,-1,17694739,false);
    }
    else if (user_decision == 6) {
    v.invoke("Make","<col=ff9040>Lantern lens</col>",1,57,-1,17694740,false);   
    }
    else if (user_decision == 7) {
    v.invoke("Make","<col=ff9040>Light orb</col>",1,57,-1,17694741,false);
    }
}

    private void setOutput() {
    if (user_decision == 0) {
         moltenOutput = 1919;
    }
    else if (user_decision == 1) {
         moltenOutput = 4527;
    }
    else if (user_decision == 2) {
         moltenOutput = 4525;
    }
    else if (user_decision == 3) {
         moltenOutput = 229;
    }
    else if (user_decision == 4) {
         moltenOutput = 6667;
    }
    else if (user_decision == 5) {
         moltenOutput = 567;
    }
    else if (user_decision == 6) {
         moltenOutput = 4542;
    }
    else if (user_decision == 7) {
         moltenOutput = 10980;
    }
    moltenOutput = moltenOutput;
    }

setOutput();
if (moltenGCount == 0 && !v.getBank().isOpen())
{ 
 v.getBank().open();
}
else if (moltenGCount == 0 && v.getBank().isOpen())
{	
    v.getBank().deposit(moltenOutput,27);
    v.getBank().withdraw(moltenG,27);
    v.getBank().close();
}
else if (multiSkillMenu != null && v.getLocalPlayer().hasAnimation(-1)) {
   setGlassMaker();
}
else if (moltenGCount >= 27 && !v.getBank().isOpen() && !v.getLocalPlayer().hasAnimation(884)) {
v.invoke("Use","<col=ff9040>Glassblowing pipe</col>",0,25,gPipeSlot,9764864,false);
v.invoke("Use","<col=ff9040>Glassblowing pipe</col><col=ffffff> -> <col=ff9040>Molten glass</col>",0,58,moltenGSlot,9764864,false);
}
