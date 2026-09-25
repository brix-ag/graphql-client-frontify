package ch.brix.gql.client.frontify.input_objects;

public class CreateCatalogInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The name of the new `Catalog`.
   */
  public CreateCatalogInput name(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("name", v);
    return this;
  }
}
