package ru.example.cassandra.metric.parser.dto

import org.springframework.data.cassandra.core.mapping.PrimaryKey
import org.springframework.data.cassandra.core.mapping.Table

@Table("default.mainmodel")
data class MainModelDto(@PrimaryKey val id: String = "", val cert_type_id: String = "", val cert_vetform_id: String = "", val cert_status_id: String = "", val cert_nature_type_id: String = "", val cert_request_type_id: String = "", val cert_reqsource_type_id: String = "", val consignor_be_id: String = "", val consignor_ent_id: String = "", val consignee_be_id: String = "", val consignee_ent_id: String = "", val sub_product_id: String = "", val product_id: String = "", val doctor_id: String = "", val unit_guid: String = "", val unit_id: String = "",
                        val base_unit_id: String = "", val cert_date: String = "", val cert_insert_date: String = "", val weight: String = "", val base_weight: String = "",
                        val consignor_be_region_id: String = "", val consignor_ent_region_id: String = "", val consignee_be_region_id: String = "", val consignee_ent_region_id: String = "",
                        val transfer_type_id: String = "", val product_type_id: String = "", val cert_source_id: String = "", val insert_date_time_ts: String = "", val cert_protected_id: String = "",
                        val protocol_version: String = "", val consignor_be_sub_region_id: String = "", val consignee_be_sub_region_id: String = "", val consignor_ent_sub_region_id: String = "",
                        val consignee_ent_sub_region_id: String = "", val repaid_date_id: String = "", val repaid_doctor_id: String = "", val repaid_cert_date: String = "",
                        val vetExpertise: String = "", val transit_time_hour: String = "", val guidOriginCountry: String = "", val product_name_id: String = "", val former_id: String = "",
                        val guidRecipientCountry: String = "", val milk_attr_fat_min: String = "", val milk_attr_fat_max: String = "", val milk_attr_fat_type: String = "", val milk_attr_density_min: String = "",
                        val milk_attr_density_max: String = "", val milk_attr_density_type: String = "", val milk_attr_protein_min: String = "", val milk_attr_protein_max: String = "", val milk_attr_protein_type: String = "") {
}