package ch.brix.gql.client.frontify.builders;

public class On_AssetRevision extends ch.brix.gql.client.TypeBuilder {
  public On_AssetRevision() {
    super(new ch.brix.gql.client.On("AssetRevision"));
  }
  /**
   * `AssetRevision` id.
   */
  public On_AssetRevision id() {
    _add_field("id");
    return this;
  }
  /**
   * `DateTime` of the `AssetRevision` creation.
   */
  public On_AssetRevision createdAt() {
    _add_field("createdAt");
    return this;
  }
  /**
   * The `User` who created the `AssetRevision`.
   */
  public On_AssetRevision creator(AssetRevision_creator callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
