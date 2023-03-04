let i = 0
let link= document.querySelectorAll(".linksEnable")

for (i=0; i<link.length; i++)
{
    let l = link[i]

    l.addEventListener("click", function(e)
    {
        e.preventDefault()

        let linksEvent = e.currentTarget 
        
        let backgroundBody = document.querySelector("body")
        backgroundBody.style.background = linksEvent.dataset.bgcolor
    })
}