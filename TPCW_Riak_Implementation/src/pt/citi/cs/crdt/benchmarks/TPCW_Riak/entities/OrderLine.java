/*
 * *********************************************************************
 * Copyright (c) 2011 Valter Balegas and Universidade Nova de Lisboa.
 * All rights reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * ********************************************************************
 */
package pt.citi.cs.crdt.benchmarks.TPCW_Riak.entities;


import org.uminho.gsd.benchmarks.interfaces.Entity;

import java.util.TreeMap;

/**
 * OL_ID
 * OL_O_ID
 * OL_I_ID
 * OL_QTY
 * OL_DISCOUNT
 * OL_COMMENT
 */
public class OrderLine implements Entity {

	public  String OL_ID;
	public  String OL_O_ID;
	public  int OL_I_ID;
	public  int OL_QTY;
	public  double OL_DISCOUNT;
	public  String OL_COMMENT;


    public OrderLine(String OL_ID, String OL_O_ID, int OL_I_ID, int OL_QTY, double OL_DISCOUNT, String OL_COMMENT) {
        this.OL_ID = OL_ID;
        this.OL_O_ID = OL_O_ID;
        this.OL_I_ID = OL_I_ID;
        this.OL_QTY = OL_QTY;
        this.OL_DISCOUNT = OL_DISCOUNT;
        this.OL_COMMENT = OL_COMMENT;
    }

    public TreeMap<String, Object> getValuesToInsert() {

        TreeMap<String, Object> values = new TreeMap<String, Object>();
        values.put("OL_ID", OL_ID);
        values.put("OL_O_ID", OL_O_ID);
        values.put("OL_I_ID", OL_I_ID);
        values.put("OL_QTY", OL_QTY);
        values.put("OL_DISCOUNT", OL_DISCOUNT);
        values.put("OL_COMMENT", OL_COMMENT);

        return values;

    }

    public String getKeyName() {
        return "OL_ID";
    }

    public String getOL_ID() {
        return OL_ID;
    }
    
    public String getOL_O_ID() {
		return OL_O_ID;
	}

	public void setOL_O_ID(String oL_O_ID) {
		OL_O_ID = oL_O_ID;
	}

	public int getOL_I_ID() {
		return OL_I_ID;
	}

	public void setOL_I_ID(int oL_I_ID) {
		OL_I_ID = oL_I_ID;
	}

	public int getOL_QTY() {
		return OL_QTY;
	}

	public void setOL_QTY(int oL_QTY) {
		OL_QTY = oL_QTY;
	}

	public double getOL_DISCOUNT() {
		return OL_DISCOUNT;
	}

	public void setOL_DISCOUNT(double oL_DISCOUNT) {
		OL_DISCOUNT = oL_DISCOUNT;
	}

	public String getOL_COMMENT() {
		return OL_COMMENT;
	}

	public void setOL_COMMENT(String oL_COMMENT) {
		OL_COMMENT = oL_COMMENT;
	}

	public void setOL_ID(String oL_ID) {
		OL_ID = oL_ID;
	}
}