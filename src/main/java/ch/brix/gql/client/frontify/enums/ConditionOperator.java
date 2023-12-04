package ch.brix.gql.client.frontify.enums;

/**
 * Condition operators. Defines how the value of the `Asset` is compared to the provided value.<br>Supported Operators:<br>- **IS**: equals to the provided value.<br>- **IS_NOT**: is not equal to provided value.
 */
public enum ConditionOperator {
  @com.google.gson.annotations.SerializedName("IS") 
  IS,
  @com.google.gson.annotations.SerializedName("IS_NOT") 
  IS_NOT;
  @java.lang.Override
  public java.lang.String toString() {
    com.google.gson.annotations.SerializedName sn = this.getClass().getDeclaredAnnotation(com.google.gson.annotations.SerializedName.class);
    if (sn == null)
      return name();
    return sn.value();
  }
}
