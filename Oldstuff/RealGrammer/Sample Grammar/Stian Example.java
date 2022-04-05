fun int AddNum(int a, int b){
  return a + b;
}

main{
  int two = 0;
  int result = 0;
  for(int one = 0; one < 10; one++, two++){
    print one;
    print two++;

    if(one == 2) {print "one is two";}
    elif(two == 4) {print "two is four";}
    else{
      result = addNum(one, two);
      print result;
    }
  }
  print result;
}