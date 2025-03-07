package ch.brix.gql.client.frontify.builders;

public class ExportCreative_job extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.CreativeExport> {
  public ExportCreative_job() {
    super(new ch.brix.gql.client.Call<>("job", "CreativeExport"));
  }
  public ExportCreative_job onCreativeExport(On_CreativeExport typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
