function calculateSalary() {
    var salary = document.getElementById("salary").value;
    var da = salary * 0.5;
    var hra = salary * 0.2;
    var pf = 1800;
    var tax = 200;
    var total = salary + da + hra - pf - tax;
    document.getElementById("da").innerHTML = da;
    document.getElementById("hra").innerHTML = hra;
    document.getElementById("pf").innerHTML = pf;
    document.getElementById("tax").innerHTML = tax;
    document.getElementById("total").innerHTML = total;
    let request = new Request('http://localhost:8080/registrations',{
        headers: new Headers({
            
            'Content-type': 'application/json'
        }),
        method: 'POST',
        body: JSON.stringify({
            "da": da,
            "hra": hra,
            "pf": pf,
            "tax": tax,
            "total": total
        })
  })}