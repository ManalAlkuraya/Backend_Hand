export default function table(){

    function addtable(){
        let btn = document.createElement("HEADER");
        btn.innerHTML="a";
        document.body.appendChild(btn);

    }
    return(
        <div>
            
            <table>
                <td id="td"></td>
            </table>
<button onclick={addtable()}>add new header </button>
        </div>
    )
}