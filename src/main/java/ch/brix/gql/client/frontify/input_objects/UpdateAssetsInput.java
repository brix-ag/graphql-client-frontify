package ch.brix.gql.client.frontify.input_objects;

/**
 * Input for a bulk `Asset` update where each entry carries its own values.
 */
public class UpdateAssetsInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** `Project` Id containing the `Assets` to update.
   */
  public UpdateAssetsInput projectId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("projectId", v);
    return this;
  }
  /**
   * **BETA** Per-`Asset` changes. Each entry names only the fields it updates; omitted fields are left untouched.
   */
  public UpdateAssetsInput assets(java.util.List<ch.brix.gql.client.frontify.input_objects.AssetUpdateEntryInput> v) {
    values.put("assets", v);
    return this;
  }
}
