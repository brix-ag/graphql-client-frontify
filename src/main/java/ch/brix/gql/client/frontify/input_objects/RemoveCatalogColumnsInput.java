package ch.brix.gql.client.frontify.input_objects;

public class RemoveCatalogColumnsInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The `id`s of the `CatalogColumn`s to remove.
   */
  public RemoveCatalogColumnsInput ids(java.util.List<ch.brix.gql.client.frontify.scalars.IdScalar> v) {
    values.put("ids", v);
    return this;
  }
  /**
   * **BETA** How to treat columns that are in use. `SAFE` (default) deletes nothing and returns the in-use columns with their reasons; `FORCE` deletes regardless and clears incoming references.
   */
  @ch.brix.gql.client.DefaultValue("SAFE")
  public RemoveCatalogColumnsInput mode(ch.brix.gql.client.frontify.enums.CatalogColumnRemovalMode v) {
    values.put("mode", v);
    return this;
  }
}
