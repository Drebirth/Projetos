//Exercicio MAPA
function getAdmin(map){
    let admins = [];
    for([key, value]of map){
        if(value === 'admin'){
            admins.push(key);
        }
    } 
    return admins;
    
}

const map = new Map();
  
map.set('Daniel', 'admin')
map.set('Sandra', 'admin')
map.set('Laura','user')

console.log(getAdmin(map));

