fun int elite(int a, int b) {
    return (a + b) % 3;
}

main {
    int a = 43, b = 13, result = 0;

    result = elite(a, b);
    if (result == 0) {
        print "Stians mor";
      }
    elif (result == 1) {
        print "Capser, Din mor";
  }
    else {
        print "Mads, Din Tysker";
}
}