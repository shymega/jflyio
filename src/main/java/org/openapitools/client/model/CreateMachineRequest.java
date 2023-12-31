/*
 * Fly Machines API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.client.model.ApiMachineConfig;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * CreateMachineRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-31T17:25:53.139932930Z[Europe/London]")
public class CreateMachineRequest {
  public static final String SERIALIZED_NAME_CONFIG = "config";
  @SerializedName(SERIALIZED_NAME_CONFIG)
  private ApiMachineConfig config;

  public static final String SERIALIZED_NAME_LEASE_TTL = "lease_ttl";
  @SerializedName(SERIALIZED_NAME_LEASE_TTL)
  private Integer leaseTtl;

  public static final String SERIALIZED_NAME_LSVD = "lsvd";
  @SerializedName(SERIALIZED_NAME_LSVD)
  private Boolean lsvd;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_SKIP_LAUNCH = "skip_launch";
  @SerializedName(SERIALIZED_NAME_SKIP_LAUNCH)
  private Boolean skipLaunch;

  public static final String SERIALIZED_NAME_SKIP_SERVICE_REGISTRATION = "skip_service_registration";
  @SerializedName(SERIALIZED_NAME_SKIP_SERVICE_REGISTRATION)
  private Boolean skipServiceRegistration;

  public CreateMachineRequest() {
  }

  public CreateMachineRequest config(ApiMachineConfig config) {
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @javax.annotation.Nullable
  public ApiMachineConfig getConfig() {
    return config;
  }

  public void setConfig(ApiMachineConfig config) {
    this.config = config;
  }


  public CreateMachineRequest leaseTtl(Integer leaseTtl) {
    this.leaseTtl = leaseTtl;
    return this;
  }

   /**
   * Get leaseTtl
   * @return leaseTtl
  **/
  @javax.annotation.Nullable
  public Integer getLeaseTtl() {
    return leaseTtl;
  }

  public void setLeaseTtl(Integer leaseTtl) {
    this.leaseTtl = leaseTtl;
  }


  public CreateMachineRequest lsvd(Boolean lsvd) {
    this.lsvd = lsvd;
    return this;
  }

   /**
   * Get lsvd
   * @return lsvd
  **/
  @javax.annotation.Nullable
  public Boolean getLsvd() {
    return lsvd;
  }

  public void setLsvd(Boolean lsvd) {
    this.lsvd = lsvd;
  }


  public CreateMachineRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Unique name for this Machine. If omitted, one is generated for you
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public CreateMachineRequest region(String region) {
    this.region = region;
    return this;
  }

   /**
   * The target region. Omitting this param launches in the same region as your WireGuard peer connection (somewhere near you).
   * @return region
  **/
  @javax.annotation.Nullable
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }


  public CreateMachineRequest skipLaunch(Boolean skipLaunch) {
    this.skipLaunch = skipLaunch;
    return this;
  }

   /**
   * Get skipLaunch
   * @return skipLaunch
  **/
  @javax.annotation.Nullable
  public Boolean getSkipLaunch() {
    return skipLaunch;
  }

  public void setSkipLaunch(Boolean skipLaunch) {
    this.skipLaunch = skipLaunch;
  }


  public CreateMachineRequest skipServiceRegistration(Boolean skipServiceRegistration) {
    this.skipServiceRegistration = skipServiceRegistration;
    return this;
  }

   /**
   * Get skipServiceRegistration
   * @return skipServiceRegistration
  **/
  @javax.annotation.Nullable
  public Boolean getSkipServiceRegistration() {
    return skipServiceRegistration;
  }

  public void setSkipServiceRegistration(Boolean skipServiceRegistration) {
    this.skipServiceRegistration = skipServiceRegistration;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateMachineRequest createMachineRequest = (CreateMachineRequest) o;
    return Objects.equals(this.config, createMachineRequest.config) &&
        Objects.equals(this.leaseTtl, createMachineRequest.leaseTtl) &&
        Objects.equals(this.lsvd, createMachineRequest.lsvd) &&
        Objects.equals(this.name, createMachineRequest.name) &&
        Objects.equals(this.region, createMachineRequest.region) &&
        Objects.equals(this.skipLaunch, createMachineRequest.skipLaunch) &&
        Objects.equals(this.skipServiceRegistration, createMachineRequest.skipServiceRegistration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, leaseTtl, lsvd, name, region, skipLaunch, skipServiceRegistration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateMachineRequest {\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    leaseTtl: ").append(toIndentedString(leaseTtl)).append("\n");
    sb.append("    lsvd: ").append(toIndentedString(lsvd)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    skipLaunch: ").append(toIndentedString(skipLaunch)).append("\n");
    sb.append("    skipServiceRegistration: ").append(toIndentedString(skipServiceRegistration)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("config");
    openapiFields.add("lease_ttl");
    openapiFields.add("lsvd");
    openapiFields.add("name");
    openapiFields.add("region");
    openapiFields.add("skip_launch");
    openapiFields.add("skip_service_registration");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateMachineRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateMachineRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateMachineRequest is not found in the empty JSON string", CreateMachineRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateMachineRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateMachineRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `config`
      if (jsonObj.get("config") != null && !jsonObj.get("config").isJsonNull()) {
        ApiMachineConfig.validateJsonElement(jsonObj.get("config"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("region") != null && !jsonObj.get("region").isJsonNull()) && !jsonObj.get("region").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `region` to be a primitive type in the JSON string but got `%s`", jsonObj.get("region").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateMachineRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateMachineRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateMachineRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateMachineRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateMachineRequest>() {
           @Override
           public void write(JsonWriter out, CreateMachineRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateMachineRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateMachineRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateMachineRequest
  * @throws IOException if the JSON string is invalid with respect to CreateMachineRequest
  */
  public static CreateMachineRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateMachineRequest.class);
  }

 /**
  * Convert an instance of CreateMachineRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

