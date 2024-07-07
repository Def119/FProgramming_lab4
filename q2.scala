@main def main() = {
    println(s"${PatternMatching(12)} ");
}

def PatternMatching(num: Int):String={
    num match {
        case  x if x <= 0 => "Negative/Zero"
        case x if x%2 == 1 => "Odd Number is given"
        case _ => "Even Number is given"
    }
}