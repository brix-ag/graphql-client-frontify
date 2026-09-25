package ch.brix.gql.client.frontify.input_objects;

public class DuplicateCatalogRowInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The `id` of the `CatalogRow` to duplicate.
   */
  public DuplicateCatalogRowInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
  /**
   * **BETA** The primary-key value for the duplicated row. Required (non-empty) when the source row's catalog has a primary column; must be null otherwise.
   */
  public DuplicateCatalogRowInput primaryKeyValue(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("primaryKeyValue", v);
    return this;
  }
}
