package com.sanchezemir.listcontact

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sanchezemir.listcontact.databinding.ItemContactBinding
import com.sanchezemir.listcontact.entity.Person
import kotlin.contracts.Returns

class PersonAdapter constructor(
    var persons: List<Person> = listOf())
    : RecyclerView.Adapter<PersonAdapter.ViewHolder>() {

    inner class ViewHolder constructor(itemView: View) : RecyclerView.ViewHolder(itemView){

        private val binding : ItemContactBinding = ItemContactBinding.bind(itemView)

        fun bind(person: Person) = with(binding) {
            tvName.text = person.fullName
            tvCargo.text = person.cargo
            tvEmail.text = person.email
            tvFirstWord.text = person.fullName.first().toString()
        }

    }

    fun updateList(persons:List<Person>){
        this.persons = persons
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view : View = View.inflate(parent.context, R.layout.item_contact, null)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val person = persons[position]
        holder.bind(person)
    }

    override fun getItemCount(): Int {
        return persons.size
    }


}