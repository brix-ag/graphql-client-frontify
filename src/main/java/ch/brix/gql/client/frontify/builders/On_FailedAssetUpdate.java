package ch.brix.gql.client.frontify.builders;

public class On_FailedAssetUpdate extends ch.brix.gql.client.TypeBuilder {
  public On_FailedAssetUpdate() {
    super(new ch.brix.gql.client.On("FailedAssetUpdate"));
  }
  /**
   * **BETA** `Asset` Id.
   */
  public On_FailedAssetUpdate id() {
    _add_field("id");
    return this;
  }
  /**
   * **BETA** Whole-asset failure code — none of the entry's changes were applied. `null` when the asset itself was writable and only individual fields failed; see `fieldErrors`.
   */
  public On_FailedAssetUpdate code() {
    _add_field("code");
    return this;
  }
  /**
   * **BETA** The entry fields that did not apply; every other requested field was applied. An asset whose every requested field failed carries all its field errors and counts as failed.
   */
  public On_FailedAssetUpdate fieldErrors(FailedAssetUpdate_fieldErrors callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
