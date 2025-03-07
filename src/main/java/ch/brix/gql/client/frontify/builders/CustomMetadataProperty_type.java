package ch.brix.gql.client.frontify.builders;

public class CustomMetadataProperty_type extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.interfaces.CustomMetadataPropertyType> {
  public CustomMetadataProperty_type() {
    super(new ch.brix.gql.client.Call<>("type", "CustomMetadataPropertyType"));
  }
  public CustomMetadataProperty_type onCustomMetadataPropertyTypeText(On_CustomMetadataPropertyTypeText typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public CustomMetadataProperty_type onCustomMetadataPropertyTypeLongText(On_CustomMetadataPropertyTypeLongText typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public CustomMetadataProperty_type onCustomMetadataPropertyTypeUrl(On_CustomMetadataPropertyTypeUrl typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public CustomMetadataProperty_type onCustomMetadataPropertyTypeNumber(On_CustomMetadataPropertyTypeNumber typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public CustomMetadataProperty_type onCustomMetadataPropertyTypeDate(On_CustomMetadataPropertyTypeDate typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public CustomMetadataProperty_type onCustomMetadataPropertyTypeSelect(On_CustomMetadataPropertyTypeSelect typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public CustomMetadataProperty_type onCustomMetadataPropertyTypeMultiSelect(On_CustomMetadataPropertyTypeMultiSelect typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public CustomMetadataProperty_type onCustomMetadataPropertyType(On_CustomMetadataPropertyType typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
