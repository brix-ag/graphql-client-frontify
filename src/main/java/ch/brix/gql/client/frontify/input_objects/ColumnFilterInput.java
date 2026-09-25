package ch.brix.gql.client.frontify.input_objects;

public class ColumnFilterInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** Column ID to filter on.
   */
  public ColumnFilterInput columnId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("columnId", v);
    return this;
  }
  /**
   * **BETA** Exact value to match.
   */
  public ColumnFilterInput value(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("value", v);
    return this;
  }
}
