package ru.samsung.itschool.game18;

class Vector {
    float x, y;
    void print()
    {
    	System.out.println("(" + x + ", " + y + ")");
    }
    
    public String toString()
    {
    	return "(" + x + "; " + y + ")";
    }
    
    void sum(Vector v)
    {
    	this.x += v.x;
    	this.y += v.y;
    }
    
   void mul(float k)
    {
    	x *= k;
    	y *= k;
    }
    
    void set(float x, float y)
    {
    	this.x = x;
    	this.y = y;
    }
    
    Vector()
    {
    	x = 0;
    	y = 0;
    }
    
    Vector(float x, float y)
    {
    	this.x = x;
    	this.y = y;
    }
    
    
    static Vector v;
	public static void main(String argS[]) {    
          System.out.println(v);
	}
}
