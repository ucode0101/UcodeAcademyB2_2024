package day_49_oop_abstraction_continue;

interface ExtendsImplements2 {

}

interface I1{

}


interface I2 extends ExtendsImplements2, I1{

}

abstract class AB2{

}

// This class inheriting one abstract class, and multiple interaces
class Test2 extends AB2 implements ExtendsImplements2, I1, I2{

}