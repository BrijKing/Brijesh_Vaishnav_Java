// alert("hello")
var myFun = () => {

var s1Name = document.getElementById('team1Name').value;
var s2Name = document.getElementById('team2Name').value;
var s1Score = document.getElementById('team1Score').value;
var s2Score = document.getElementById('team2Score').value;

const s1 = s1Score.split('/')
const s2 = s2Score.split('/')

// console.log(s1[1]);


   
    if (s1[1]>=10 || s2[1]>=10 || s1[1] == null || s2[1] == null) {
        console.log("error");
        document.getElementById('result').innerText = `score board is wrong`
    }
    else if(s1Name === s2Name){
        console.log("team names are same");
        document.getElementById('result').innerText = ` both team can not be same`
    }
    else{

        if(s1[0] > s2[0]){
            document.getElementById('result').innerText = `${s1Name} wins by ${s1[0] - s2[0]} runs`
        }
        else{
            document.getElementById('result').innerText = `${s2Name} wins by ${10-s2[1]} wickets`
        }
    }
}



