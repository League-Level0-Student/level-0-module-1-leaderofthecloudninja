
void setup() {
PImage face = loadImage("zombie.jpg");
size(1000,1000);
face.resize(1000,1000);
image(face,0,0);
}
void draw() {
fill(5,5,5);
fill(mouseX/4,mouseY/4,30);
ellipse(355,160,170,125);
ellipse(105,165,125,100);
fill(5,5,5);
ellipse(355,160,30,30);
ellipse(105,165,30,30);
}
