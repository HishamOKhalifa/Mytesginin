import 'package:adobe_xd/adobe_xd.dart';

import 'package:flutter/material.dart';
import 'package:fluttertoast/fluttertoast.dart';
import 'package:get/get.dart';

import 'package:flutter_riverpod/flutter_riverpod.dart';



class MyApp extends StatefulWidget {
  @override
  _MyAppState createState() => _MyAppState();
}


final anyname = StateProvider<String>((ref)=> 'Hi everyone');




class _MyAppState extends State<MyApp> {

  bool valuecheckbox = true;




  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("hi"),
        backgroundColor: Colors.blueGrey,

      ),
      body: Stack(
        children: <Widget>[
          Pinned.fromPins(
            Pin(size: 290.0, end: 63.0),
            Pin(size: 226.0, start: 84.0),
            /*child:
              // Adobe XD layer: 'Android-VS-Apple' (shape)
              Container(
                decoration: BoxDecoration(
                  image: DecorationImage(
                    image: const AssetImage(''),
                    fit: BoxFit.cover,
                  ),
                  border: Border.all(width: 1.0, color: const Color(0xff707070)),
                ),
              ),*/
          ),
          Pinned.fromPins(
            Pin(start: 55.0, end: 49.0),
            Pin(size: 73.0, middle: 0.4701),
            child: Stack(
              children: <Widget>[
                Pinned.fromPins(
                  Pin(start: 0.0, end: 0.0),
                  Pin(start: 0.0, end: 0.0),
                  child: Container(
                    decoration: BoxDecoration(
                      borderRadius: BorderRadius.circular(10.0),
                      color: const Color(0xff124265),
                      border: Border.all(
                          width: 1.0, color: const Color(0xff707070)),
                    ),
                  ),
                ),
                Pinned.fromPins(
                  Pin(size: 125.0, middle: 0.5176),
                  Pin(size: 27.0, middle: 0.5),
                  child: Consumer(
                    builder: (context, watch, child)=> RaisedButton(onPressed: (){ signinToast(); }, child: Text(
                      'SignIn button',
                      style: TextStyle(
                        fontFamily: 'Segoe UI',
                        fontSize: 20,
                        color: const Color(0xffffffff),
                      ),
                      textAlign: TextAlign.left,
                    ),
                    ),
                  ),


                ),
              ],
            ),
          ),
          Pinned.fromPins(
            Pin(start: 55.0, end: 49.0),
            Pin(size: 69.0, middle: 0.5974),
            child: Stack(
              children: <Widget>[
                Pinned.fromPins(
                  Pin(start: 0.0, end: 0.0),
                  Pin(start: 0.0, end: 0.0),
                ),
                Pinned.fromPins(
                    Pin(size: 129.0, middle: 0.5179),
                    Pin(size: 27.0, middle: 0.5),
                    child: RaisedButton(onPressed: (){}, child: Container(
                      decoration: BoxDecoration(
                        borderRadius: BorderRadius.circular(10.0),
                        color: const Color(0xff9bc035),
                        border: Border.all(
                            width: 1.0, color: const Color(0xff707070)),
                      ),
                      child: Text(
                        'SignUp',
                        style: TextStyle(
                          fontFamily: 'Segoe UI',
                          fontSize: 20,
                          color: const Color(0xff124265),
                        ),
                        textAlign: TextAlign.left,
                      ),
                    )
                    )
                ),
              ],
            ),
          ),
          Pinned.fromPins(
            Pin(size: 140.0, end: 23.0),
            Pin(size: 27.0, middle: 0.6663),
            child: Text(
              'ForgetPassword',
              style: TextStyle(
                fontFamily: 'Segoe UI',
                fontSize: 20,
                color: const Color(0xff124265),
              ),
              textAlign: TextAlign.left,
            ),
          ),
          Pinned.fromPins(
            Pin(size: 23.0, middle: 0.1728),
            Pin(size: 23.0, middle: 0.6667),
            child: Container(
              decoration: BoxDecoration(
                color: const Color(0xffffffff),
                border: Border.all(width: 1.0, color: const Color(0xff707070)),
              ),
            ),
          ),
          Pinned.fromPins(
              Pin(size: 129.0, middle: 0.3244),
              Pin(size: 27.0, middle: 0.6663),
              child: Checkbox(value: valuecheckbox, onChanged: (bool value){
                checkboxforrememberme();
              })
          ),
          Pinned.fromPins(
            Pin(size: 220.0, middle: 0.5144),
            Pin(size: 43.0, middle: 0.752),
            child: Text(
              'See Our Privacy',
              style: TextStyle(
                fontFamily: 'Segoe UI',
                fontSize: 32,
                color: const Color(0xff124265),
              ),
              textAlign: TextAlign.left,
            ),
          ),
        ],
      ),

    );
  }

  void checkboxforrememberme(){
    if(valuecheckbox==true){
      Fluttertoast.showToast(msg: "$anyname", toastLength: Toast.LENGTH_LONG,
          gravity: ToastGravity.BOTTOM, backgroundColor: Colors.blue, textColor: Colors.white);
    }
  }

  void signinToast(){
    Fluttertoast.showToast(msg: "I am the sign in Toast", toastLength: Toast.LENGTH_LONG,
        gravity: ToastGravity.BOTTOM, backgroundColor: Colors.black54, textColor: Colors.white);
  }




}

/*

  class Toastfun{

  String signintoast = "I am the sign in Toast";
  void signinToast(){
    Fluttertoast.showToast(msg: signintoast, toastLength: Toast.LENGTH_LONG,
        gravity: ToastGravity.BOTTOM, backgroundColor: Colors.black54, textColor: Colors.white);
  }


}
*/




// Get.to(Signin()); That's for go to another activity in GetX Flutter

