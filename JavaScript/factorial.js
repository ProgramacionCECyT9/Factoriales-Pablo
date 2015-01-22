input = document.getElementById('factorial_of')
input.onkeyup = function getFactorialValue()
{
    var factorial_of = parseInt(document.getElementById('factorial_of').value);
    if(document.getElementById('factorial_of').value == "")
    {
        document.getElementById('factorial_value').innerHTML = '0';
    }
    else
    {
        result = 1
        for(var i = 1; i <= factorial_of; i++)
        {
            result *= i;
        }
        document.getElementById('factorial_value').innerHTML = result;
    }
}
