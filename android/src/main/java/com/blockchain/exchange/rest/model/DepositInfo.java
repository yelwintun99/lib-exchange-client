/**
 * Blockchain.com Exchange REST API
 * ## Introduction Welcome to Blockchain.com's Exchange API and developer documentation. These documents detail and give examples of various functionality offered by the API such as receiving real time market data, requesting balance information and performing trades. ## To Get Started Create or log into your existing Blockchain.com Exchange account Select API from the drop down menu Fill out form and click “Create New API Key Now” Once generated you can view your keys under API Settings 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.blockchain.exchange.rest.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class DepositInfo {
  
  @SerializedName("depositId")
  private String depositId = null;
  @SerializedName("amount")
  private Double amount = null;
  @SerializedName("currency")
  private String currency = null;
  @SerializedName("address")
  private String address = null;
  @SerializedName("txHash")
  private String txHash = null;
  public enum StateEnum {
     REJECTED,  UNCONFIRMED,  COMPLETED, 
  };
  @SerializedName("state")
  private StateEnum state = null;
  @SerializedName("timestamp")
  private Long timestamp = null;

  /**
   * Unique ID for this withdrawal
   **/
  @ApiModelProperty(required = true, value = "Unique ID for this withdrawal")
  public String getDepositId() {
    return depositId;
  }
  public void setDepositId(String depositId) {
    this.depositId = depositId;
  }

  /**
   * The amount that is credited in the currency specified
   **/
  @ApiModelProperty(required = true, value = "The amount that is credited in the currency specified")
  public Double getAmount() {
    return amount;
  }
  public void setAmount(Double amount) {
    this.amount = amount;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   * Address to deposit to. If a tag or memo must be used, it is separated by a colon.
   **/
  @ApiModelProperty(required = true, value = "Address to deposit to. If a tag or memo must be used, it is separated by a colon.")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * The transaction hash of the transaction that deposited funds
   **/
  @ApiModelProperty(value = "The transaction hash of the transaction that deposited funds")
  public String getTxHash() {
    return txHash;
  }
  public void setTxHash(String txHash) {
    this.txHash = txHash;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }

  /**
   * Time in ms since 01/01/1970 (epoch)
   **/
  @ApiModelProperty(value = "Time in ms since 01/01/1970 (epoch)")
  public Long getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositInfo depositInfo = (DepositInfo) o;
    return (this.depositId == null ? depositInfo.depositId == null : this.depositId.equals(depositInfo.depositId)) &&
        (this.amount == null ? depositInfo.amount == null : this.amount.equals(depositInfo.amount)) &&
        (this.currency == null ? depositInfo.currency == null : this.currency.equals(depositInfo.currency)) &&
        (this.address == null ? depositInfo.address == null : this.address.equals(depositInfo.address)) &&
        (this.txHash == null ? depositInfo.txHash == null : this.txHash.equals(depositInfo.txHash)) &&
        (this.state == null ? depositInfo.state == null : this.state.equals(depositInfo.state)) &&
        (this.timestamp == null ? depositInfo.timestamp == null : this.timestamp.equals(depositInfo.timestamp));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.depositId == null ? 0: this.depositId.hashCode());
    result = 31 * result + (this.amount == null ? 0: this.amount.hashCode());
    result = 31 * result + (this.currency == null ? 0: this.currency.hashCode());
    result = 31 * result + (this.address == null ? 0: this.address.hashCode());
    result = 31 * result + (this.txHash == null ? 0: this.txHash.hashCode());
    result = 31 * result + (this.state == null ? 0: this.state.hashCode());
    result = 31 * result + (this.timestamp == null ? 0: this.timestamp.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositInfo {\n");
    
    sb.append("  depositId: ").append(depositId).append("\n");
    sb.append("  amount: ").append(amount).append("\n");
    sb.append("  currency: ").append(currency).append("\n");
    sb.append("  address: ").append(address).append("\n");
    sb.append("  txHash: ").append(txHash).append("\n");
    sb.append("  state: ").append(state).append("\n");
    sb.append("  timestamp: ").append(timestamp).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}