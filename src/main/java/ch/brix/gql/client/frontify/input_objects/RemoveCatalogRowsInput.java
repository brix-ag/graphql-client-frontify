package ch.brix.gql.client.frontify.input_objects;

public class RemoveCatalogRowsInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The `id`s of the `CatalogRow`s to remove.
   */
  public RemoveCatalogRowsInput ids(java.util.List<ch.brix.gql.client.frontify.scalars.IdScalar> v) {
    values.put("ids", v);
    return this;
  }
  /**
   * **BETA** How to treat rows that are in use. `SAFE` (default) deletes nothing and returns the in-use rows with their reasons; `FORCE` deletes regardless and clears incoming references.
   */
  @ch.brix.gql.client.DefaultValue("SAFE")
  public RemoveCatalogRowsInput mode(ch.brix.gql.client.frontify.enums.CatalogRowRemovalMode v) {
    values.put("mode", v);
    return this;
  }
}
