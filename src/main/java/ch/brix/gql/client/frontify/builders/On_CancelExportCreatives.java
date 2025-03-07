package ch.brix.gql.client.frontify.builders;

public class On_CancelExportCreatives extends ch.brix.gql.client.TypeBuilder {
  public On_CancelExportCreatives() {
    super(new ch.brix.gql.client.On("CancelExportCreatives"));
  }
  /**
   * **BETA** A list of `CreativeJobs` that have been canceled successfully.
   */
  public On_CancelExportCreatives canceledJobs(CancelExportCreatives_canceledJobs callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
