package ch.brix.gql.client.frontify.input_objects;

public class MoveCatalogRowInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The `id` of the `CatalogRow` to move.
   */
  public MoveCatalogRowInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
  /**
   * **BETA** The new position for the `CatalogRow`.
   */
  public MoveCatalogRowInput position(ch.brix.gql.client.frontify.scalars.IntScalar v) {
    values.put("position", v);
    return this;
  }
}
