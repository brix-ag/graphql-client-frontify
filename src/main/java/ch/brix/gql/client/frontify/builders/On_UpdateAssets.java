package ch.brix.gql.client.frontify.builders;

public class On_UpdateAssets extends ch.brix.gql.client.TypeBuilder {
  public On_UpdateAssets() {
    super(new ch.brix.gql.client.On("UpdateAssets"));
  }
  /**
   * **BETA** Outcome of the bulk update. Changes apply independently per asset and per field; a partial failure does not roll back applied changes.
   */
  public On_UpdateAssets status() {
    _add_field("status");
    return this;
  }
  /**
   * **BETA** Failures only: an `Asset` absent from this list had every requested change applied in full.
   */
  public On_UpdateAssets failedAssets(UpdateAssets_failedAssets callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** `Assets` touched by this mutation, reflecting their state after whatever changes succeeded. Includes assets with field errors, since those were still partially updated; excludes assets present in `failedAssets` with a non-null `code`, since those were not touched at all.
   */
  public On_UpdateAssets updatedAssets(UpdateAssets_updatedAssets callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
