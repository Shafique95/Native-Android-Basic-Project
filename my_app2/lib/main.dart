import 'package:flutter/material.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: "Learning Container",
      debugShowCheckedModeBanner: false,
      home: HomePage(),
    );
  }
}

class HomePage extends StatelessWidget {
  const HomePage({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
        body: SafeArea(
            child: Stack(
      children: [
        /*
        Container(
          height: 200,
          width: 200,
          color: Colors.red,
          child: Center(child: Text("Container 01")),
        ),
        Container(
          height: 210,
          width: 210,
          color: Colors.green,
          child: Center(child: Text("Container 01")),
        ),
        Container(
          height: 220,
          width: 2200,
          color: Colors.blue,
          child: Center(child: Text("Container 01")),
        ),
        Container(
          height: 230,
          width: 230,
          color: Colors.yellow,
          child: Center(child: Text("Container 01")),
        ),

         */
        SizedBox(
          width: 300.0,
          height: 300.0,
          child: Container(
            color: Colors.green,
            child: Center(child: Text("Container 01")),
          ),
        ),
        SizedBox(
          width: 150.0,
          height: 150.0,
          child: Container(color: Colors.yellow),
        ),
        SizedBox(
          width: 100.0,
          height: 100.0,
          child: Container(color: Colors.red),
        ),
      ],
    )));
  }
}
