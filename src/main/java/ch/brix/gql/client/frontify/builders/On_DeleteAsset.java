package ch.brix.gql.client.frontify.builders;

public class On_DeleteAsset extends ch.brix.gql.client.TypeBuilder {
  public On_DeleteAsset() {
    super(new ch.brix.gql.client.On("DeleteAsset"));
  }
  /**
   * The Id of the deleted `Asset`.
   */
  public On_DeleteAsset id() {
    _add_field("id");
    return this;
  }
  /**
   * **DEPRECATED** `Asset` details. This field will be removed. Use `id` instead. | Date: 2024-01-01T00:00:00.000+00:00
   * This field will be removed. Use `id` instead. | Date: 2024-01-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  public On_DeleteAsset asset(DeleteAsset_asset callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
