main {
    if() {}
    if(1) {}
    if(1 >> 2) {}
}

fun int kage() {
    elif() {}
}
fun int kage2() {
    elif(1 == 1) {}
}

fun int kage3(int i, int j) {
    elif(j == i) {}
}
fun int kage4() {
    else {}
}

fun int kage5(int x) {
    if (x) {} elif(!x) {} else {}
}

fun int kage6(int x) {
    if (x) {} else {}
}
fun int kage7(int x) {
    elif (x) {} else {}
}