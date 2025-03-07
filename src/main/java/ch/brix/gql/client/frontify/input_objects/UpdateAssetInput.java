package ch.brix.gql.client.frontify.input_objects;

public class UpdateAssetInput extends ch.brix.gql.client.InputObject {
  /**
   * `Asset` Id.
   */
  public UpdateAssetInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
  /**
   * `Asset` data.
   */
  public UpdateAssetInput data(ch.brix.gql.client.frontify.input_objects.UpdateAssetDataInput v) {
    values.put("data", v);
    return this;
  }
}
