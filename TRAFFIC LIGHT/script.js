window.onload = function () {
    var $ = function (e) {
        return document.querySelector(e);
    };

    //color for right-top arrow
    var setSubColorRT = function (c) {
        $("#human-RT-body").style.stroke = c;
    };

    //color for left-top arrow
    var setSubColorLT = function (c) {
        $("#human-LT-body").style.stroke = c;
    }

    //color for right-bottom arrow
    var setSubColorRB = function (c) {
        $("#human-RB-body").style.stroke = c;
    }

    //color for left-bottom arrow
    var setSubColorLB = function (c) {
        $("#human-LB-body").style.stroke = c;
    }


    var setColor = function (e, c) {
        e.style.backgroundColor = c;
    };

    // for right-top signal
    var redRT = $("#red-RT");
    var yellowRT = $("#yellow-RT");
    var greenRT = $("#green-RT");

    //for left-top signal
    var redLT = $("#red-LT");
    var yellowLT = $("#yellow-LT");
    var greenLT = $("#green-LT");

    //for right-bottom signal
    var redRB = $("#red-RB");
    var yellowRB = $("#yellow-RB");
    var greenRB = $("#green-RB");

    //for left-bottom signal
    var redLB = $("#red-LB");
    var yellowLB = $("#yellow-LB");
    var greenLB = $("#green-LB");

    //for right-top signal
    var timerNumRT = $("#timer-RT");

    //for left-top signal
    var timerNumLT = $("#timer-LT");

    //for right-bottom signal
    var timerNumRB = $("#timer-RB");

    //for left-bottom signal
    var timerNumLB = $("#timer-LB");

    var green = "#00ff00";
    var yellow = "#ffc400";
    var red = "#ff0000";
    var gDim = "#0c350c";
    var yDim = "#36361a";
    var rDim = "#330f0f";

    var gOnRT = new isOn();
    var rOnRT = new isOn();
    var yOnRT = new isOn();

    var gOnLT = new isOn();
    var rOnLT = new isOn();
    var yOnLT = new isOn();

    var gOnLB = new isOn();
    var rOnLB = new isOn();
    var yOnLB = new isOn();

    var gOnRB = new isOn();
    var rOnRB = new isOn();
    var yOnRB = new isOn();

    function check(n) {
        n = parseInt(n);
        while (isNaN(n)) {
            n = parseInt(prompt("enter a valid number!"));
        }
        return Math.floor(n);
    }

    var redTimerRT = check(30);
    var yellowTimerRT = check(10);
    var greenTimerRT = check(40);


    var redTimerLT = check(40);
    var yellowTimerLT = check(10);
    var greenTimerLT = check(40);


    var redTimerLB = check(60);
    var yellowTimerLB = check(10);
    var greenTimerLB = check(40);


    var redTimerRB = check(80);
    var yellowTimerRB = check(10);
    var greenTimerRB = check(40);

    var totalTime = greenTimerRT + yellowTimerRT + redTimerRT;
    var timeCountRT = greenTimerRT;
    var timeCountLT = greenTimerLT;
    var timeCountLB = greenTimerLB;
    var timeCountRB = greenTimerRB;

    if (greenTimerRT && yellowTimerRT && redTimerRT) {
        var i = 1;
        var intr = setInterval(function () {
            if (i <= greenTimerRT) {
                if (rOnRT.getOn()) {
                    timeCountRT = greenTimerRT;
                    timeCountLT = redTimerLT;
                    timeCountRB = redTimerRB;
                    timeCountLB = redTimerLB;
                }
                yOnRT.setOn(false);
                rOnRT.setOn(false);
                gOnRT.setOn(true);

                yOnLT.setOn(false);
                rOnLT.setOn(true);
                gOnLT.setOn(false);

                yOnLB.setOn(false);
                rOnLB.setOn(true);
                gOnLB.setOn(false);

                yOnRB.setOn(false);
                rOnRB.setOn(true);
                gOnRB.setOn(false);

                timerNumRT.innerHTML = timeCountRT--;
                timerNumLT.innerHTML = timeCountLT--;
                timerNumLB.innerHTML = timeCountLB--;
                timerNumRB.innerHTML = timeCountRB--;

                setColor(yellowRT, yDim);
                setColor(redRT, rDim);
                setColor(greenRT, green);
                setSubColorRT("green");

                setColor(yellowLT, yDim);
                setColor(redLT, red);
                setColor(greenLT, gDim);
                setSubColorLT("red");

                setColor(yellowLB, yDim);
                setColor(redLB, red);
                setColor(greenLB, gDim);
                setSubColorLB("red");

                setColor(yellowRB, yDim);
                setColor(redRB, red);
                setColor(greenRB, gDim);
                setSubColorRB("red");

            } else if (i > greenTimerRT && i <= greenTimerRT + yellowTimerRT) {
                if (gOnRT.getOn()) {
                    timeCountRT = yellowTimerRT;
                }

                gOnRT.setOn(false);
                rOnRT.setOn(false);
                yOnRT.setOn(true);

                timerNumRT.innerHTML = timeCountRT--;

                setColor(greenRT, gDim);
                setColor(redRT, rDim);
                setColor(yellowRT, yellow);
                setSubColorRT("yellow");
            } else {
                if (yOnRT.getOn()) {
                    timeCountRT = redTimerRT;
                }

                gOnRT.setOn(false);
                yOnRT.setOn(false);
                rOnRT.setOn(true);

                timerNumRT.innerHTML = timeCountRT--;

                if (timeCountRT == redTimerRT - 1) {
                    setSubColorRT("green");
                }
                if (timeCountRT == 1) {
                    setSubColorRT("red");
                }

                setColor(yellowRT, yDim);
                setColor(greenRT, gDim);
                setColor(redRT, red);
                setSubColorRT("red");
            }
            i++;
            if (i - 1 >= totalTime) {
                i = 0;
            }
        }, 1000);
    } else {
        alert("error, don't input 0");
    }
};

var isOn = function () {
    this.on = false;
    this.setOn = function (b) {
        this.on = b;
    };
    this.getOn = function () {
        return this.on;
    };
};