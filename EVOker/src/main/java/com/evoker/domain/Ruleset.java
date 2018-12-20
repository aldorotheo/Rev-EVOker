package com.evoker.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import javax.persistence.JoinColumn;

@Entity
@Table(name="EVOkerRuleset")
@Component
public class Ruleset {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ruleset_id")
	private int rulesetID;
	@Column(name="timed")
	private int timed;
	@Column(name="stock")
	private int stock;
	@Column(name="supers")
	private int supers;
	@ManyToMany
	@JoinTable(name="evokerbanlist", joinColumns=@JoinColumn(name="ruleset_id"), inverseJoinColumns=@JoinColumn(name="char_id"))
	private List<EVOCharacter> banList;
	public void banCharacter(EVOCharacter banned)
	{
		banList.add(banned);
	}
	public List<EVOCharacter> getBanList() {
		return banList;
	}
	public void setBanList(List<EVOCharacter> banList) {
		this.banList = banList;
	}
	public Ruleset() {
		super();
		this.banList = new ArrayList<EVOCharacter>();
	}
	public Ruleset(int rulesetId, int timed, int stock, int supers) {
		super();
		this.rulesetID = rulesetId;
		this.timed = timed;
		this.stock = stock;
		this.supers = supers;
		this.banList = new ArrayList<EVOCharacter>();
	}
	@Override
	public String toString() {
		return "Ruleset [rulesetId=" + rulesetID + ", timed=" + timed + ", stock=" + stock + ", supers=" + supers + "]";
	}
	public int getRulesetId() {
		return rulesetID;
	}
	public void setRulesetId(int rulesetId) {
		this.rulesetID = rulesetId;
	}
	public int getTimed() {
		return timed;
	}
	public void setTimed(int timed) {
		this.timed = timed;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getSupers() {
		return supers;
	}
	public void setSupers(int supers) {
		this.supers = supers;
	}
}
