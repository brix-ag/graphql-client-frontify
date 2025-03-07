package ch.brix.gql.client.frontify.builders;

public class CancelExportCreatives_canceledJobs extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.CreativeExport>> {
  public CancelExportCreatives_canceledJobs() {
    super(new ch.brix.gql.client.Call<>("canceledJobs", "CreativeExport"));
  }
  public CancelExportCreatives_canceledJobs onCreativeExport(On_CreativeExport typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
