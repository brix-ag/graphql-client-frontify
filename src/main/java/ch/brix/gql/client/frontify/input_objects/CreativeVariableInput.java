package ch.brix.gql.client.frontify.input_objects;

public class CreativeVariableInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** Template variable `Key`.
   */
  public CreativeVariableInput key(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("key", v);
    return this;
  }
  /**
   * **BETA** `Value` of template variable.
   */
  public CreativeVariableInput value(ch.brix.gql.client.frontify.scalars.AnyScalar v) {
    values.put("value", v);
    return this;
  }
}
