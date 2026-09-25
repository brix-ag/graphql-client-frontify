package ch.brix.gql.client.frontify.input_objects;

public class MoveCatalogColumnInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The `id` of the `CatalogColumn` to move.
   */
  public MoveCatalogColumnInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
  /**
   * **BETA** The new position for the `CatalogColumn`.
   */
  public MoveCatalogColumnInput position(ch.brix.gql.client.frontify.scalars.IntScalar v) {
    values.put("position", v);
    return this;
  }
}
