package ch.brix.gql.client.frontify.input_objects;

public class CustomMetadataInput extends ch.brix.gql.client.InputObject {
  /**
   * `CustomMetadataProperty` Id.
   */
  public CustomMetadataInput propertyId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("propertyId", v);
    return this;
  }
  /**
   * `CustomMetadataProperty` value. Polymorphic per property type: scalar (`String`/`Float`/`Int`/`DateTime`) for single-value types; list of `Int` option IDs for `MULTISELECT`; for `CATALOG`, a non-empty list of entry objects of the shape `[{"rowId": 123, "children": [{"rowId": 456, "sourceColumnId": 789}]}, …]` — the server persists the selection transparently.
   */
  public CustomMetadataInput value(ch.brix.gql.client.frontify.scalars.AnyScalar v) {
    values.put("value", v);
    return this;
  }
}
