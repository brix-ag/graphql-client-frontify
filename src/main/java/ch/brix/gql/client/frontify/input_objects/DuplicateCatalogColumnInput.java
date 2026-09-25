package ch.brix.gql.client.frontify.input_objects;

public class DuplicateCatalogColumnInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The `id` of the `CatalogColumn` to duplicate.
   */
  public DuplicateCatalogColumnInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
  /**
   * **BETA** The new name for the duplicated `CatalogColumn`.
   */
  public DuplicateCatalogColumnInput name(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("name", v);
    return this;
  }
}
