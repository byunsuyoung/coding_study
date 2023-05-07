function solution(emergency) {
    const sortedEmergency = [...emergency].sort((a,b) => b-a)
    var answer = emergency.map((a,_) => sortedEmergency.indexOf(a)+1);
    return answer;
}