package com.example.roulette

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.GONE
import android.widget.Button
import android.widget.TableLayout
import android.widget.TextView
import androidx.annotation.Nullable
import androidx.core.view.marginStart
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val runRoulette:Button = findViewById(R.id.goButton)

        runRoulette.setOnClickListener{setRandomNumber()}

    }

    val redNum = arrayOf(1,3,5,7,9,12,14,16,18,19,21,23,25,27,30,32,34,36)
    val blackNum = arrayOf(2,4,6,8,10,11,13,15,17,20,22,24,26,28,29,31,33,35)
    val evenNum = arrayOf(2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,36)
    val oddNum = arrayOf(1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31,33,35)

    val pastWin = mutableListOf<String>()
    val pastWinB = mutableListOf<String>()
    val pastWinC = mutableListOf<String>()


    fun setRandomNumber(){

        // Generating Winning Number
        val randNum = (0..36).random()
        winningNumber.text="Winning Number: "+randNum
        val numberHighlight = "bet"+randNum.toString()

        // Adding winning number to list
        pastWin.add(0,randNum.toString())

        // Determining how many past winning numbers to show
        if (pastNumbers1.isChecked){
            winList.text=pastWin.take(1).toString()
        } else if (pastNumbers2.isChecked){
            winList.text=pastWin.take(2).toString()
        } else if (pastNumbers3.isChecked){
            winList.text=pastWin.take(3).toString()
        } else if (pastNumbers4.isChecked){
            winList.text=pastWin.take(4).toString()
        }

        // Red, Black, 0 highlights and Lists
        if (redNum.contains(randNum)&&colorblindSwitch.isChecked){
            betRed.setBackgroundColor(Color.WHITE)
            betRed.setTextColor(Color.BLACK)

            betBlack.setBackgroundColor(Color.BLACK)
            betBlack.setTextColor(Color.WHITE)

            bet0.setBackgroundColor(Color.DKGRAY)
            bet0.setTextColor(Color.WHITE)

            pastWinB.add(0,"Red")

            if (pastNumbers1.isChecked){
                winListB.text=pastWinB.take(1).toString()
            } else if (pastNumbers2.isChecked){
                winListB.text=pastWinB.take(2).toString()
            } else if (pastNumbers3.isChecked){
                winListB.text=pastWinB.take(3).toString()
            } else if (pastNumbers4.isChecked){
                winListB.text=pastWinB.take(4).toString()
            }

        } else if (blackNum.contains(randNum)&&colorblindSwitch.isChecked){
            betRed.setBackgroundColor(Color.GRAY)
            betRed.setTextColor(Color.WHITE)

            betBlack.setBackgroundColor(Color.WHITE)
            betBlack.setTextColor(Color.BLACK)

            bet0.setBackgroundColor(Color.DKGRAY)
            bet0.setTextColor(Color.WHITE)

            pastWinB.add(0,"Black")

            if (pastNumbers1.isChecked){
                winListB.text=pastWinB.take(1).toString()
            } else if (pastNumbers2.isChecked){
                winListB.text=pastWinB.take(2).toString()
            } else if (pastNumbers3.isChecked){
                winListB.text=pastWinB.take(3).toString()
            } else if (pastNumbers4.isChecked){
                winListB.text=pastWinB.take(4).toString()
            }

        } else if (randNum==0&&colorblindSwitch.isChecked){
            betRed.setBackgroundColor(Color.GRAY)
            betRed.setTextColor(Color.WHITE)

            betBlack.setBackgroundColor(Color.BLACK)
            betBlack.setTextColor(Color.WHITE)

            bet0.setBackgroundColor(Color.WHITE)
            bet0.setTextColor(Color.BLACK)

            pastWinB.add(0,"0")

            if (pastNumbers1.isChecked){
                winListB.text=pastWinB.take(1).toString()
            } else if (pastNumbers2.isChecked){
                winListB.text=pastWinB.take(2).toString()
            } else if (pastNumbers3.isChecked){
                winListB.text=pastWinB.take(3).toString()
            } else if (pastNumbers4.isChecked){
                winListB.text=pastWinB.take(4).toString()
            }

        } else if (redNum.contains(randNum)) {
            betRed.setBackgroundColor(Color.YELLOW)
            betRed.setTextColor(Color.BLACK)

            betBlack.setBackgroundColor(Color.BLACK)
            betBlack.setTextColor(Color.WHITE)

            bet0.setBackgroundColor(Color.parseColor("#39833C"))
            bet0.setTextColor(Color.WHITE)

            pastWinB.add(0,"Red")

            if (pastNumbers1.isChecked){
                winListB.text=pastWinB.take(1).toString()
            } else if (pastNumbers2.isChecked){
                winListB.text=pastWinB.take(2).toString()
            } else if (pastNumbers3.isChecked){
                winListB.text=pastWinB.take(3).toString()
            } else if (pastNumbers4.isChecked){
                winListB.text=pastWinB.take(4).toString()
            }

        } else if(blackNum.contains(randNum)){
            betRed.setBackgroundColor(Color.RED)
            betRed.setTextColor(Color.WHITE)

            betBlack.setBackgroundColor(Color.YELLOW)
            betBlack.setTextColor(Color.BLACK)

            bet0.setBackgroundColor(Color.parseColor("#39833C"))
            bet0.setTextColor(Color.WHITE)

            pastWinB.add(0,"Black")

            if (pastNumbers1.isChecked){
                winListB.text=pastWinB.take(1).toString()
            } else if (pastNumbers2.isChecked){
                winListB.text=pastWinB.take(2).toString()
            } else if (pastNumbers3.isChecked){
                winListB.text=pastWinB.take(3).toString()
            } else if (pastNumbers4.isChecked){
                winListB.text=pastWinB.take(4).toString()
            }

        } else {
            betRed.setBackgroundColor(Color.RED)
            betRed.setTextColor(Color.WHITE)

            betBlack.setBackgroundColor(Color.BLACK)
            betBlack.setTextColor(Color.WHITE)

            bet0.setBackgroundColor(Color.YELLOW)
            bet0.setTextColor(Color.BLACK)

            pastWinB.add(0,"0")

            if (pastNumbers1.isChecked){
                winListB.text=pastWinB.take(1).toString()
            } else if (pastNumbers2.isChecked){
                winListB.text=pastWinB.take(2).toString()
            } else if (pastNumbers3.isChecked){
                winListB.text=pastWinB.take(3).toString()
            } else if (pastNumbers4.isChecked){
                winListB.text=pastWinB.take(4).toString()
            }

        }


        // Even and Odd Highlights and Lists
        if (evenNum.contains(randNum) && colorblindSwitch.isChecked){
            betEven.setBackgroundColor(Color.WHITE)
            betEven.setTextColor(Color.BLACK)

            betOdd.setBackgroundColor(Color.DKGRAY)
            betOdd.setTextColor(Color.WHITE)

            pastWinC.add(0,"Even")

            if (pastNumbers1.isChecked){
                winListC.text=pastWinC.take(1).toString()
            } else if (pastNumbers2.isChecked){
                winListC.text=pastWinC.take(2).toString()
            } else if (pastNumbers3.isChecked){
                winListC.text=pastWinC.take(3).toString()
            } else if (pastNumbers4.isChecked){
                winListC.text=pastWinC.take(4).toString()
            }

        } else if (oddNum.contains(randNum) && colorblindSwitch.isChecked){
            betEven.setBackgroundColor(Color.DKGRAY)
            betEven.setTextColor(Color.WHITE)

            betOdd.setBackgroundColor(Color.WHITE)
            betOdd.setTextColor(Color.BLACK)

            pastWinC.add(0,"Odd")

            if (pastNumbers1.isChecked){
                winListC.text=pastWinC.take(1).toString()
            } else if (pastNumbers2.isChecked){
                winListC.text=pastWinC.take(2).toString()
            } else if (pastNumbers3.isChecked){
                winListC.text=pastWinC.take(3).toString()
            } else if (pastNumbers4.isChecked){
                winListC.text=pastWinC.take(4).toString()
            }

        } else if (randNum == 0 && colorblindSwitch.isChecked){
            betEven.setBackgroundColor(Color.DKGRAY)
            betEven.setTextColor(Color.WHITE)

            betOdd.setBackgroundColor(Color.DKGRAY)
            betOdd.setTextColor(Color.WHITE)

            pastWinC.add(0,"0")

            if (pastNumbers1.isChecked){
                winListC.text=pastWinC.take(1).toString()
            } else if (pastNumbers2.isChecked){
                winListC.text=pastWinC.take(2).toString()
            } else if (pastNumbers3.isChecked){
                winListC.text=pastWinC.take(3).toString()
            } else if (pastNumbers4.isChecked){
                winListC.text=pastWinC.take(4).toString()
            }

        } else if (evenNum.contains(randNum)) {
            betEven.setBackgroundColor(Color.YELLOW)
            betEven.setTextColor(Color.BLACK)

            betOdd.setBackgroundColor(Color.parseColor("#39833C"))
            betOdd.setTextColor(Color.WHITE)

            pastWinC.add(0,"Even")

            if (pastNumbers1.isChecked){
                winListC.text=pastWinC.take(1).toString()
            } else if (pastNumbers2.isChecked){
                winListC.text=pastWinC.take(2).toString()
            } else if (pastNumbers3.isChecked){
                winListC.text=pastWinC.take(3).toString()
            } else if (pastNumbers4.isChecked){
                winListC.text=pastWinC.take(4).toString()
            }

        } else if(oddNum.contains(randNum)) {
            betEven.setBackgroundColor(Color.parseColor("#39833C"))
            betEven.setTextColor(Color.WHITE)

            betOdd.setBackgroundColor(Color.YELLOW)
            betOdd.setTextColor(Color.BLACK)

            pastWinC.add(0,"Odd")

            if (pastNumbers1.isChecked){
                winListC.text=pastWinC.take(1).toString()
            } else if (pastNumbers2.isChecked){
                winListC.text=pastWinC.take(2).toString()
            } else if (pastNumbers3.isChecked){
                winListC.text=pastWinC.take(3).toString()
            } else if (pastNumbers4.isChecked){
                winListC.text=pastWinC.take(4).toString()
            }

        } else {
            betEven.setBackgroundColor(Color.parseColor("#39833C"))
            betEven.setTextColor(Color.WHITE)

            betOdd.setBackgroundColor(Color.parseColor("#39833C"))
            betOdd.setTextColor(Color.WHITE)

            pastWinC.add(0,"0")

            if (pastNumbers1.isChecked){
                winListC.text=pastWinC.take(1).toString()
            } else if (pastNumbers2.isChecked){
                winListC.text=pastWinC.take(2).toString()
            } else if (pastNumbers3.isChecked){
                winListC.text=pastWinC.take(3).toString()
            } else if (pastNumbers4.isChecked){
                winListC.text=pastWinC.take(4).toString()
            }
        }


    // if statements for individual numbers

        // Red Number Winning Highlights
        if (numberHighlight !="bet1" && colorblindSwitch.isChecked) {
            bet1.setBackgroundColor(Color.GRAY)
            bet1.setTextColor(Color.WHITE)
        } else if (numberHighlight =="bet1" && colorblindSwitch.isChecked){
            bet1.setBackgroundColor(Color.WHITE)
            bet1.setTextColor(Color.BLACK)
        } else if (numberHighlight == "bet1"){
            bet1.setBackgroundColor(Color.YELLOW)
            bet1.setTextColor(Color.BLACK)
        } else {
            bet1.setBackgroundColor(Color.RED)
            bet1.setTextColor(Color.WHITE)
        }

        if (numberHighlight !="bet3" && colorblindSwitch.isChecked){
            bet3.setBackgroundColor(Color.GRAY)
            bet3.setTextColor(Color.WHITE)
        } else if (numberHighlight =="bet3" && colorblindSwitch.isChecked){
            bet3.setBackgroundColor(Color.WHITE)
            bet3.setTextColor(Color.BLACK)
        } else if (numberHighlight == "bet3"){
            bet3.setBackgroundColor(Color.YELLOW)
            bet3.setTextColor(Color.BLACK)
        }else {
            bet3.setBackgroundColor(Color.RED)
            bet3.setTextColor(Color.WHITE)
        }

        if (numberHighlight !="bet5" && colorblindSwitch.isChecked){
            bet5.setBackgroundColor(Color.GRAY)
            bet5.setTextColor(Color.WHITE)
        } else if (numberHighlight =="bet5" && colorblindSwitch.isChecked){
            bet5.setBackgroundColor(Color.WHITE)
            bet5.setTextColor(Color.BLACK)
        } else if (numberHighlight == "bet5"){
            bet5.setBackgroundColor(Color.YELLOW)
            bet5.setTextColor(Color.BLACK)
        } else {
            bet5.setBackgroundColor(Color.RED)
            bet5.setTextColor(Color.WHITE)
        }

        if (numberHighlight !="bet7" && colorblindSwitch.isChecked){
            bet7.setBackgroundColor(Color.GRAY)
            bet7.setTextColor(Color.WHITE)
        } else if (numberHighlight =="bet7" && colorblindSwitch.isChecked){
            bet7.setBackgroundColor(Color.WHITE)
            bet7.setTextColor(Color.BLACK)
        } else if (numberHighlight == "bet7"){
        bet7.setBackgroundColor(Color.YELLOW)
        bet7.setTextColor(Color.BLACK)
        } else {
            bet7.setBackgroundColor(Color.RED)
            bet7.setTextColor(Color.WHITE)
        }

        if (numberHighlight !="bet9" && colorblindSwitch.isChecked){
            bet9.setBackgroundColor(Color.GRAY)
            bet9.setTextColor(Color.WHITE)
        } else if (numberHighlight =="bet9" && colorblindSwitch.isChecked){
            bet9.setBackgroundColor(Color.WHITE)
            bet9.setTextColor(Color.BLACK)
        } else if (numberHighlight == "bet9"){
            bet9.setBackgroundColor(Color.YELLOW)
            bet9.setTextColor(Color.BLACK)
        } else {
            bet9.setBackgroundColor(Color.RED)
            bet9.setTextColor(Color.WHITE)
        }

        if (numberHighlight !="bet12" && colorblindSwitch.isChecked){
            bet12.setBackgroundColor(Color.GRAY)
            bet12.setTextColor(Color.WHITE)
        } else if (numberHighlight =="bet12" && colorblindSwitch.isChecked){
            bet12.setBackgroundColor(Color.WHITE)
            bet12.setTextColor(Color.BLACK)
        } else if (numberHighlight == "bet12"){
            bet12.setBackgroundColor(Color.YELLOW)
            bet12.setTextColor(Color.BLACK)
        } else {
            bet12.setBackgroundColor(Color.RED)
            bet12.setTextColor(Color.WHITE)
        }

        if (numberHighlight !="bet14" && colorblindSwitch.isChecked){
            bet14.setBackgroundColor(Color.GRAY)
            bet14.setTextColor(Color.WHITE)
        } else if (numberHighlight =="bet14" && colorblindSwitch.isChecked){
            bet14.setBackgroundColor(Color.WHITE)
            bet14.setTextColor(Color.BLACK)
        } else if (numberHighlight == "bet14"){
            bet14.setBackgroundColor(Color.YELLOW)
            bet14.setTextColor(Color.BLACK)
        } else {
            bet14.setBackgroundColor(Color.RED)
            bet14.setTextColor(Color.WHITE)
        }

        if (numberHighlight !="bet16" && colorblindSwitch.isChecked){
            bet16.setBackgroundColor(Color.GRAY)
            bet16.setTextColor(Color.WHITE)
        } else if (numberHighlight =="bet16" && colorblindSwitch.isChecked){
            bet16.setBackgroundColor(Color.WHITE)
            bet16.setTextColor(Color.BLACK)
        } else if (numberHighlight == "bet16"){
            bet16.setBackgroundColor(Color.YELLOW)
            bet16.setTextColor(Color.BLACK)
        } else {
            bet16.setBackgroundColor(Color.RED)
            bet16.setTextColor(Color.WHITE)
        }

        if (numberHighlight !="bet18" && colorblindSwitch.isChecked){
            bet18.setBackgroundColor(Color.GRAY)
            bet18.setTextColor(Color.WHITE)
        } else if (numberHighlight =="bet18" && colorblindSwitch.isChecked){
            bet18.setBackgroundColor(Color.WHITE)
            bet18.setTextColor(Color.BLACK)
        } else if (numberHighlight == "bet18"){
            bet18.setBackgroundColor(Color.YELLOW)
            bet18.setTextColor(Color.BLACK)
        } else {
            bet18.setBackgroundColor(Color.RED)
            bet18.setTextColor(Color.WHITE)
        }

        if (numberHighlight !="bet19" && colorblindSwitch.isChecked){
            bet19.setBackgroundColor(Color.GRAY)
            bet19.setTextColor(Color.WHITE)
        } else if (numberHighlight =="bet19" && colorblindSwitch.isChecked){
            bet19.setBackgroundColor(Color.WHITE)
            bet19.setTextColor(Color.BLACK)
        } else if (numberHighlight == "bet19"){
            bet19.setBackgroundColor(Color.YELLOW)
            bet19.setTextColor(Color.BLACK)
        } else {
            bet19.setBackgroundColor(Color.RED)
            bet19.setTextColor(Color.WHITE)
        }

        if (numberHighlight !="bet21" && colorblindSwitch.isChecked){
            bet21.setBackgroundColor(Color.GRAY)
            bet21.setTextColor(Color.WHITE)
        } else if (numberHighlight =="bet21" && colorblindSwitch.isChecked){
            bet21.setBackgroundColor(Color.WHITE)
            bet21.setTextColor(Color.BLACK)
        } else if (numberHighlight == "bet21"){
            bet21.setBackgroundColor(Color.YELLOW)
            bet21.setTextColor(Color.BLACK)
        } else {
            bet21.setBackgroundColor(Color.RED)
            bet21.setTextColor(Color.WHITE)
        }

        if (numberHighlight !="bet23" && colorblindSwitch.isChecked){
            bet23.setBackgroundColor(Color.GRAY)
            bet23.setTextColor(Color.WHITE)
        } else if (numberHighlight =="bet23" && colorblindSwitch.isChecked){
            bet23.setBackgroundColor(Color.WHITE)
            bet23.setTextColor(Color.BLACK)
        } else if (numberHighlight == "bet23"){
            bet23.setBackgroundColor(Color.YELLOW)
            bet23.setTextColor(Color.BLACK)
        } else {
            bet23.setBackgroundColor(Color.RED)
            bet23.setTextColor(Color.WHITE)
        }

        if (numberHighlight !="bet25" && colorblindSwitch.isChecked){
            bet25.setBackgroundColor(Color.GRAY)
            bet25.setTextColor(Color.WHITE)
        } else if (numberHighlight =="bet25" && colorblindSwitch.isChecked){
            bet25.setBackgroundColor(Color.WHITE)
            bet25.setTextColor(Color.BLACK)
        } else if (numberHighlight == "bet25"){
            bet25.setBackgroundColor(Color.YELLOW)
            bet25.setTextColor(Color.BLACK)
        } else {
            bet25.setBackgroundColor(Color.RED)
            bet25.setTextColor(Color.WHITE)
        }

        if (numberHighlight !="bet27" && colorblindSwitch.isChecked){
            bet27.setBackgroundColor(Color.GRAY)
            bet27.setTextColor(Color.WHITE)
        } else if (numberHighlight =="bet27" && colorblindSwitch.isChecked){
            bet27.setBackgroundColor(Color.WHITE)
            bet27.setTextColor(Color.BLACK)
        } else if (numberHighlight == "bet27"){
            bet27.setBackgroundColor(Color.YELLOW)
            bet27.setTextColor(Color.BLACK)
        } else {
            bet27.setBackgroundColor(Color.RED)
            bet27.setTextColor(Color.WHITE)
        }

        if (numberHighlight !="bet30" && colorblindSwitch.isChecked){
            bet30.setBackgroundColor(Color.GRAY)
            bet30.setTextColor(Color.WHITE)
        } else if (numberHighlight =="bet30" && colorblindSwitch.isChecked){
            bet30.setBackgroundColor(Color.WHITE)
            bet30.setTextColor(Color.BLACK)
        } else if (numberHighlight == "bet30"){
            bet30.setBackgroundColor(Color.YELLOW)
            bet30.setTextColor(Color.BLACK)
        } else {
            bet30.setBackgroundColor(Color.RED)
            bet30.setTextColor(Color.WHITE)
        }

        if (numberHighlight !="bet32" && colorblindSwitch.isChecked){
            bet32.setBackgroundColor(Color.GRAY)
            bet32.setTextColor(Color.WHITE)
        } else if (numberHighlight =="bet32" && colorblindSwitch.isChecked){
            bet32.setBackgroundColor(Color.WHITE)
            bet32.setTextColor(Color.BLACK)
        } else if (numberHighlight == "bet32"){
            bet32.setBackgroundColor(Color.YELLOW)
            bet32.setTextColor(Color.BLACK)
        } else {
            bet32.setBackgroundColor(Color.RED)
            bet32.setTextColor(Color.WHITE)
        }

        if (numberHighlight !="bet34" && colorblindSwitch.isChecked){
            bet34.setBackgroundColor(Color.GRAY)
            bet34.setTextColor(Color.WHITE)
        } else if (numberHighlight =="bet34" && colorblindSwitch.isChecked){
            bet34.setBackgroundColor(Color.WHITE)
            bet34.setTextColor(Color.BLACK)
        } else if (numberHighlight == "bet34"){
            bet34.setBackgroundColor(Color.YELLOW)
            bet34.setTextColor(Color.BLACK)
        } else {
            bet34.setBackgroundColor(Color.RED)
            bet34.setTextColor(Color.WHITE)
        }

        if (numberHighlight !="bet36" && colorblindSwitch.isChecked){
            bet36.setBackgroundColor(Color.GRAY)
            bet36.setTextColor(Color.WHITE)
        } else if (numberHighlight =="bet36" && colorblindSwitch.isChecked){
            bet36.setBackgroundColor(Color.WHITE)
            bet36.setTextColor(Color.BLACK)
        } else if (numberHighlight == "bet36"){
            bet36.setBackgroundColor(Color.YELLOW)
            bet36.setTextColor(Color.BLACK)
        } else {
            bet36.setBackgroundColor(Color.RED)
            bet36.setTextColor(Color.WHITE)
        }




        // Black Number Winning Highlight
        if (numberHighlight !="bet2" && colorblindSwitch.isChecked){
            bet2.setBackgroundColor(Color.BLACK)
            bet2.setTextColor(Color.WHITE)
        } else if (numberHighlight=="bet2" && colorblindSwitch.isChecked){
            bet2.setBackgroundColor(Color.WHITE)
            bet2.setTextColor(Color.BLACK)
        } else if (numberHighlight == "bet2"){
            bet2.setBackgroundColor(Color.YELLOW)
            bet2.setTextColor(Color.BLACK)
        } else {
            bet2.setBackgroundColor(Color.BLACK)
            bet2.setTextColor(Color.WHITE)
        }

        if (numberHighlight !="bet4" && colorblindSwitch.isChecked){
            bet4.setBackgroundColor(Color.BLACK)
            bet4.setTextColor(Color.WHITE)
        } else if (numberHighlight=="bet4" && colorblindSwitch.isChecked){
            bet4.setBackgroundColor(Color.WHITE)
            bet4.setTextColor(Color.BLACK)
        } else if (numberHighlight == "bet4"){
            bet4.setBackgroundColor(Color.YELLOW)
            bet4.setTextColor(Color.BLACK)
        } else {
            bet4.setBackgroundColor(Color.BLACK)
            bet4.setTextColor(Color.WHITE)
        }

        if (numberHighlight !="bet6" && colorblindSwitch.isChecked){
            bet6.setBackgroundColor(Color.BLACK)
            bet6.setTextColor(Color.WHITE)
        } else if (numberHighlight=="bet6" && colorblindSwitch.isChecked){
            bet6.setBackgroundColor(Color.WHITE)
            bet6.setTextColor(Color.BLACK)
        } else if (numberHighlight == "bet6"){
            bet6.setBackgroundColor(Color.YELLOW)
            bet6.setTextColor(Color.BLACK)
        } else {
            bet6.setBackgroundColor(Color.BLACK)
            bet6.setTextColor(Color.WHITE)
        }

        if (numberHighlight !="bet8" && colorblindSwitch.isChecked){
            bet8.setBackgroundColor(Color.BLACK)
            bet8.setTextColor(Color.WHITE)
        } else if (numberHighlight=="bet8" && colorblindSwitch.isChecked){
            bet8.setBackgroundColor(Color.WHITE)
            bet8.setTextColor(Color.BLACK)
        } else if (numberHighlight == "bet8"){
            bet8.setBackgroundColor(Color.YELLOW)
            bet8.setTextColor(Color.BLACK)
        } else {
            bet8.setBackgroundColor(Color.BLACK)
            bet8.setTextColor(Color.WHITE)
        }

        if (numberHighlight !="bet10" && colorblindSwitch.isChecked){
            bet10.setBackgroundColor(Color.BLACK)
            bet10.setTextColor(Color.WHITE)
        } else if (numberHighlight=="bet10" && colorblindSwitch.isChecked){
            bet10.setBackgroundColor(Color.WHITE)
            bet10.setTextColor(Color.BLACK)
        } else if (numberHighlight == "bet10"){
            bet10.setBackgroundColor(Color.YELLOW)
            bet10.setTextColor(Color.BLACK)
        } else {
            bet10.setBackgroundColor(Color.BLACK)
            bet10.setTextColor(Color.WHITE)
        }

        if (numberHighlight !="bet11" && colorblindSwitch.isChecked){
            bet11.setBackgroundColor(Color.BLACK)
            bet11.setTextColor(Color.WHITE)
        } else if (numberHighlight=="bet11" && colorblindSwitch.isChecked){
            bet11.setBackgroundColor(Color.WHITE)
            bet11.setTextColor(Color.BLACK)
        } else if (numberHighlight == "bet11"){
            bet11.setBackgroundColor(Color.YELLOW)
            bet11.setTextColor(Color.BLACK)
        } else {
            bet11.setBackgroundColor(Color.BLACK)
            bet11.setTextColor(Color.WHITE)
        }

        if (numberHighlight !="bet13" && colorblindSwitch.isChecked){
            bet13.setBackgroundColor(Color.BLACK)
            bet13.setTextColor(Color.WHITE)
        } else if (numberHighlight=="bet13" && colorblindSwitch.isChecked){
            bet13.setBackgroundColor(Color.WHITE)
            bet13.setTextColor(Color.BLACK)
        } else if (numberHighlight == "bet13"){
            bet13.setBackgroundColor(Color.YELLOW)
            bet13.setTextColor(Color.BLACK)
        } else {
            bet13.setBackgroundColor(Color.BLACK)
            bet13.setTextColor(Color.WHITE)
        }

        if (numberHighlight !="bet15" && colorblindSwitch.isChecked){
            bet15.setBackgroundColor(Color.BLACK)
            bet15.setTextColor(Color.WHITE)
        } else if (numberHighlight=="bet15" && colorblindSwitch.isChecked){
            bet15.setBackgroundColor(Color.WHITE)
            bet15.setTextColor(Color.BLACK)
        } else if (numberHighlight == "bet15"){
            bet15.setBackgroundColor(Color.YELLOW)
            bet15.setTextColor(Color.BLACK)
        } else {
            bet15.setBackgroundColor(Color.BLACK)
            bet15.setTextColor(Color.WHITE)
        }

        if (numberHighlight !="bet17" && colorblindSwitch.isChecked){
            bet17.setBackgroundColor(Color.BLACK)
            bet17.setTextColor(Color.WHITE)
        } else if (numberHighlight=="bet17" && colorblindSwitch.isChecked){
            bet17.setBackgroundColor(Color.WHITE)
            bet17.setTextColor(Color.BLACK)
        } else if (numberHighlight == "bet17"){
            bet17.setBackgroundColor(Color.YELLOW)
            bet17.setTextColor(Color.BLACK)
        } else {
            bet17.setBackgroundColor(Color.BLACK)
            bet17.setTextColor(Color.WHITE)
        }

        if (numberHighlight !="bet20" && colorblindSwitch.isChecked){
            bet20.setBackgroundColor(Color.BLACK)
            bet20.setTextColor(Color.WHITE)
        } else if (numberHighlight=="bet20" && colorblindSwitch.isChecked){
            bet20.setBackgroundColor(Color.WHITE)
            bet20.setTextColor(Color.BLACK)
        } else if (numberHighlight == "bet20"){
            bet20.setBackgroundColor(Color.YELLOW)
            bet20.setTextColor(Color.BLACK)
        } else {
            bet20.setBackgroundColor(Color.BLACK)
            bet20.setTextColor(Color.WHITE)
        }

        if (numberHighlight !="bet22" && colorblindSwitch.isChecked){
            bet22.setBackgroundColor(Color.BLACK)
            bet22.setTextColor(Color.WHITE)
        } else if (numberHighlight=="bet22" && colorblindSwitch.isChecked){
            bet22.setBackgroundColor(Color.WHITE)
            bet22.setTextColor(Color.BLACK)
        } else if (numberHighlight == "bet22"){
            bet22.setBackgroundColor(Color.YELLOW)
            bet22.setTextColor(Color.BLACK)
        } else {
            bet22.setBackgroundColor(Color.BLACK)
            bet22.setTextColor(Color.WHITE)
        }

        if (numberHighlight !="bet24" && colorblindSwitch.isChecked){
            bet24.setBackgroundColor(Color.BLACK)
            bet24.setTextColor(Color.WHITE)
        } else if (numberHighlight=="bet24" && colorblindSwitch.isChecked){
            bet24.setBackgroundColor(Color.WHITE)
            bet24.setTextColor(Color.BLACK)
        } else if (numberHighlight == "bet24"){
            bet24.setBackgroundColor(Color.YELLOW)
            bet24.setTextColor(Color.BLACK)
        } else {
            bet24.setBackgroundColor(Color.BLACK)
            bet24.setTextColor(Color.WHITE)
        }

        if (numberHighlight !="bet26" && colorblindSwitch.isChecked){
            bet26.setBackgroundColor(Color.BLACK)
            bet26.setTextColor(Color.WHITE)
        } else if (numberHighlight=="bet26" && colorblindSwitch.isChecked){
            bet26.setBackgroundColor(Color.WHITE)
            bet26.setTextColor(Color.BLACK)
        } else if (numberHighlight == "bet26"){
            bet26.setBackgroundColor(Color.YELLOW)
            bet26.setTextColor(Color.BLACK)
        } else {
            bet26.setBackgroundColor(Color.BLACK)
            bet26.setTextColor(Color.WHITE)
        }

        if (numberHighlight !="bet28" && colorblindSwitch.isChecked){
            bet28.setBackgroundColor(Color.BLACK)
            bet28.setTextColor(Color.WHITE)
        } else if (numberHighlight=="bet28" && colorblindSwitch.isChecked){
            bet28.setBackgroundColor(Color.WHITE)
            bet28.setTextColor(Color.BLACK)
        } else if (numberHighlight == "bet28"){
            bet28.setBackgroundColor(Color.YELLOW)
            bet28.setTextColor(Color.BLACK)
        } else {
            bet28.setBackgroundColor(Color.BLACK)
            bet28.setTextColor(Color.WHITE)
        }

        if (numberHighlight !="bet29" && colorblindSwitch.isChecked){
            bet29.setBackgroundColor(Color.BLACK)
            bet29.setTextColor(Color.WHITE)
        } else if (numberHighlight=="bet29" && colorblindSwitch.isChecked){
            bet29.setBackgroundColor(Color.WHITE)
            bet29.setTextColor(Color.BLACK)
        } else if (numberHighlight == "bet29"){
            bet29.setBackgroundColor(Color.YELLOW)
            bet29.setTextColor(Color.BLACK)
        } else {
            bet29.setBackgroundColor(Color.BLACK)
            bet29.setTextColor(Color.WHITE)
        }

        if (numberHighlight !="bet31" && colorblindSwitch.isChecked){
            bet31.setBackgroundColor(Color.BLACK)
            bet31.setTextColor(Color.WHITE)
        } else if (numberHighlight=="bet31" && colorblindSwitch.isChecked){
            bet31.setBackgroundColor(Color.WHITE)
            bet31.setTextColor(Color.BLACK)
        } else if (numberHighlight == "bet31"){
            bet31.setBackgroundColor(Color.YELLOW)
            bet31.setTextColor(Color.BLACK)
        } else {
            bet31.setBackgroundColor(Color.BLACK)
            bet31.setTextColor(Color.WHITE)
        }

        if (numberHighlight !="bet33" && colorblindSwitch.isChecked){
            bet33.setBackgroundColor(Color.BLACK)
            bet33.setTextColor(Color.WHITE)
        } else if (numberHighlight=="bet33" && colorblindSwitch.isChecked){
            bet33.setBackgroundColor(Color.WHITE)
            bet33.setTextColor(Color.BLACK)
        } else if (numberHighlight == "bet33"){
            bet33.setBackgroundColor(Color.YELLOW)
            bet33.setTextColor(Color.BLACK)
        } else {
            bet33.setBackgroundColor(Color.BLACK)
            bet33.setTextColor(Color.WHITE)
        }

        if (numberHighlight !="bet35" && colorblindSwitch.isChecked){
            bet35.setBackgroundColor(Color.BLACK)
            bet35.setTextColor(Color.WHITE)
        } else if (numberHighlight=="bet35" && colorblindSwitch.isChecked){
            bet35.setBackgroundColor(Color.WHITE)
            bet35.setTextColor(Color.BLACK)
        } else if (numberHighlight == "bet35"){
            bet35.setBackgroundColor(Color.YELLOW)
            bet35.setTextColor(Color.BLACK)
        } else {
            bet35.setBackgroundColor(Color.BLACK)
            bet35.setTextColor(Color.WHITE)
        }

        /* bet0.setOnClickListener{
            if (chip1.isChecked){
                wager1.visibility=View.VISIBLE
                wager10.visibility=View.GONE
                wager5.visibility=View.GONE
                wager25.visibility=View.GONE
            } else if (chip5.isChecked){
                wager1.visibility=View.GONE
                wager10.visibility=View.VISIBLE
                wager5.visibility=View.GONE
                wager25.visibility=View.GONE
            } else if (chip10.isChecked){
                wager1.visibility=View.GONE
                wager10.visibility=View.GONE
                wager5.visibility=View.VISIBLE
                wager25.visibility=View.GONE
            } else {
                wager1.visibility=View.GONE
                wager10.visibility=View.GONE
                wager5.visibility=View.GONE
                wager25.visibility=View.VISIBLE
            }
        } */

    }

    // Help Screen Open
    fun helpScreen(view: View){
        goButton.visibility=View.GONE
        winningNumber.visibility=View.GONE
        chip_group.visibility=View.GONE
        betTable.visibility=View.GONE
        bet0.visibility=View.GONE
        helpButton.visibility=View.GONE
        settingsButton.visibility=View.GONE
        textView9.visibility=View.GONE
        winList.visibility=View.GONE
        winListB.visibility=View.GONE
        winListC.visibility=View.GONE
        creditCount.visibility=View.GONE


        helpInfo.visibility=View.VISIBLE
    }

    // Help Screen Close
    fun closeHelp(view: View){
        goButton.visibility=View.VISIBLE
        winningNumber.visibility=View.VISIBLE
        chip_group.visibility=View.VISIBLE
        betTable.visibility=View.VISIBLE
        bet0.visibility=View.VISIBLE
        helpButton.visibility=View.VISIBLE
        settingsButton.visibility=View.VISIBLE
        textView9.visibility=View.VISIBLE
        winList.visibility=View.VISIBLE
        winListB.visibility=View.VISIBLE
        winListC.visibility=View.VISIBLE
        creditCount.visibility=View.VISIBLE



        helpInfo.visibility=View.GONE
    }

    // Settings Screen Open
    fun settingsScreen(view: View){
        goButton.visibility=View.GONE
        winningNumber.visibility=View.GONE
        chip_group.visibility=View.GONE
        betTable.visibility=View.GONE
        bet0.visibility=View.GONE
        helpButton.visibility=View.GONE
        settingsButton.visibility=View.GONE
        textView9.visibility=View.GONE
        winList.visibility=View.GONE
        winListB.visibility=View.GONE
        winListC.visibility=View.GONE
        creditCount.visibility=View.GONE

        settings.visibility=View.VISIBLE
    }

    // Settings Screen Close
    fun closeSettings(view: View){
        goButton.visibility=View.VISIBLE
        winningNumber.visibility=View.VISIBLE
        chip_group.visibility=View.VISIBLE
        betTable.visibility=View.VISIBLE
        bet0.visibility=View.VISIBLE
        helpButton.visibility=View.VISIBLE
        settingsButton.visibility=View.VISIBLE
        textView9.visibility=View.VISIBLE
        winList.visibility=View.VISIBLE
        winListB.visibility=View.VISIBLE
        winListC.visibility=View.VISIBLE
        creditCount.visibility=View.VISIBLE

        settings.visibility= GONE

        // Past Numbers Display Options
        if (pastNumbersOff.isChecked){
            winList.text = pastWin.toString()
            winList.visibility = GONE
            winListB.visibility = GONE
            winListC.visibility = GONE
            textView9.visibility = GONE
        }

        // Colorblind Mode
        if(colorblindSwitch.isChecked){
            mainBackground.setBackgroundColor(Color.BLACK)
            goButton.setBackgroundColor(Color.WHITE)
            goButton.setTextColor(Color.BLACK)
            bet1.setBackgroundColor(Color.GRAY)
            bet3.setBackgroundColor(Color.GRAY)
            bet5.setBackgroundColor(Color.GRAY)
            bet7.setBackgroundColor(Color.GRAY)
            bet9.setBackgroundColor(Color.GRAY)
            bet12.setBackgroundColor(Color.GRAY)
            bet14.setBackgroundColor(Color.GRAY)
            bet16.setBackgroundColor(Color.GRAY)
            bet18.setBackgroundColor(Color.GRAY)
            bet19.setBackgroundColor(Color.GRAY)
            bet21.setBackgroundColor(Color.GRAY)
            bet23.setBackgroundColor(Color.GRAY)
            bet25.setBackgroundColor(Color.GRAY)
            bet27.setBackgroundColor(Color.GRAY)
            bet30.setBackgroundColor(Color.GRAY)
            bet32.setBackgroundColor(Color.GRAY)
            bet34.setBackgroundColor(Color.GRAY)
            bet36.setBackgroundColor(Color.GRAY)
            betRed.setBackgroundColor(Color.GRAY)
            bet0.setBackgroundColor(Color.DKGRAY)
            bet0.setTextColor(Color.WHITE)
            betEven.setBackgroundColor(Color.DKGRAY)
            betEven.setTextColor(Color.WHITE)
            betOdd.setBackgroundColor(Color.DKGRAY)
            betOdd.setTextColor(Color.WHITE)
        }

        else{
            mainBackground.setBackgroundColor(Color.parseColor("#39833C"))
            goButton.setBackgroundColor(Color.parseColor("#FF6200EE"))
            goButton.setTextColor(Color.WHITE)
            bet1.setBackgroundColor(Color.RED)
            bet3.setBackgroundColor(Color.RED)
            bet5.setBackgroundColor(Color.RED)
            bet7.setBackgroundColor(Color.RED)
            bet9.setBackgroundColor(Color.RED)
            bet12.setBackgroundColor(Color.RED)
            bet14.setBackgroundColor(Color.RED)
            bet16.setBackgroundColor(Color.RED)
            bet18.setBackgroundColor(Color.RED)
            bet19.setBackgroundColor(Color.RED)
            bet21.setBackgroundColor(Color.RED)
            bet23.setBackgroundColor(Color.RED)
            bet25.setBackgroundColor(Color.RED)
            bet27.setBackgroundColor(Color.RED)
            bet30.setBackgroundColor(Color.RED)
            bet32.setBackgroundColor(Color.RED)
            bet34.setBackgroundColor(Color.RED)
            bet36.setBackgroundColor(Color.RED)
            betRed.setBackgroundColor(Color.RED)
            bet0.setBackgroundColor(Color.parseColor("#39833C"))
            betEven.setBackgroundColor(Color.parseColor("#39833C"))
            betOdd.setBackgroundColor(Color.parseColor("#39833C"))
            bet0.setTextColor(Color.WHITE)
            betEven.setTextColor(Color.WHITE)
            betOdd.setTextColor(Color.WHITE)
        }
    }

}