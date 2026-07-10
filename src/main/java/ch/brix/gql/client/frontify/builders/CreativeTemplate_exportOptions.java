package ch.brix.gql.client.frontify.builders;

public class CreativeTemplate_exportOptions extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.CreativeTemplateExportOption>> {
  public CreativeTemplate_exportOptions() {
    super(new ch.brix.gql.client.Call<>("exportOptions", "CreativeTemplateExportOption"));
  }
  public CreativeTemplate_exportOptions onCreativeTemplateExportOption(On_CreativeTemplateExportOption typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
